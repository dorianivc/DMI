package personas.datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import personas.logica.Persona;
import personas.presentacion.listado.Estado;

public class Dao {
    RelDatabase db;
    
    public Dao(){
        db= new RelDatabase();
    }

    public Persona PersonaGet(String id) throws Exception{
        String sql="select * "+
                "from personas.persona p "+
                "where p.idPersona='%s'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        System.out.println(sql);
        if (rs.next()) {
            return persona(rs);
        }
        else{
            throw new Exception ("Persona no Existe");
        }
    }
    
    public void PersonaDelete(Persona p) throws Exception{
        String sql="delete from personas.persona where idPersona='%s'";
        sql = String.format(sql,p.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }

    public void PersonaAdd(Persona p) throws Exception{
        String sql="insert into personas.persona (idPersona, nombre, sexo, estado_codigo) "+
                "values('%s','%s','%s','%s')";
        sql=String.format(sql,p.getId(),p.getNombre(),p.getSexo(),p.getEstado().estado);
       System.out.println(sql);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona ya existe");
        }
    }

    public void PersonaUpdate(Persona p) throws Exception{
        String sql="update personas.persona set nombre='%s',sexo='%s', estado_codigo='%s' "+
                "where idPersona='%s'";
        sql=String.format(sql,p.getNombre(),p.getSexo(),p.getId(), p.getEstado().estado);
        System.out.println("Salida: "+sql );
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }
    public List<Estado> getEstado()throws Exception{
      String sql="select * from personas.estado;";
        System.out.println("Salida: "+ sql);
        ResultSet rs =  db.executeQuery(sql);
        List<Estado> resultado= new ArrayList<>();
        while(rs.next()){
            resultado.add(estado(rs));
        }
        return resultado;
    }
    
    public List<Persona> PersonaSearch(String nombre) throws Exception{
        List<Persona> resultado = new ArrayList<Persona>();
        try {
            String sql="select * from "+
                    "personas.persona p "+
                    "where p.nombre like '%%%s%%'";
            sql=String.format(sql,nombre);
            System.out.println(sql);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(persona(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    Estado buscarEstado(String cod) throws Exception{
        ArrayList<Estado> lista= (ArrayList<Estado>) getEstado();
        int tam=lista.size();
        Estado estadito=null;
        for(int i=0;i<tam;i++){
           estadito = lista.get(i);
            if(estadito.estado.equals(cod)){
                return estadito;
            }
        }
        return new Estado("000","Sin Estado");
    }
    private Persona persona(ResultSet rs) throws Exception{
        try {
            Persona p= new Persona();
            p.setId(rs.getString("idPersona"));
            p.setNombre(rs.getString("nombre"));
            p.setSexo(rs.getString("sexo").charAt(0));
            p.setEstado(buscarEstado(rs.getString("estado_codigo")));
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }
    private Estado estado(ResultSet rs) throws SQLException{
        try{
            Estado p= new Estado(rs.getString("codigo"), rs.getString("descripcion"));
            return p;
        }catch (SQLException ex) {
            return null;
        }
    }
   public  void close(){
    }
}
