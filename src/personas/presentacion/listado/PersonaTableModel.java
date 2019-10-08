/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.presentacion.listado;

import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import personas.logica.Persona;

/**
 *
 * @author Escinf
 */
public class PersonaTableModel extends AbstractTableModel{
    List<Persona> personas;   
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch(columnIndex){
            case 2: return Icon.class;
            case 3: return Boolean.class;
            default: return super.getColumnClass(columnIndex);
        }
    }
    private Icon sexo(Persona p){
        String file="";
        switch(p.getSexo()){
            case 'M': file="male.png";break;
            case 'F': file="female.png";break;
        }
        return new ImageIcon(getClass().getResource("/personas/presentacion/icons/sexo/"+file));
    }

    public PersonaTableModel(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "ID";
            case 1: return "Nombre";
            case 2: return "Sexo";
            case 3: return "Nacional";
            case 4: return "Estado Civil";
            default: return "";
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p=personas.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getId();
            case 1: return p.getNombre();
            case 2: return sexo(p);
            case 3: return p.esNacional();
            case 4: return p.getEstado().toString();
            default: return "";
        }
    }    
}
