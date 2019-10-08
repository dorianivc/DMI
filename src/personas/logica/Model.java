/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import personas.datos.Dao;
import personas.presentacion.listado.Estado;

/**
 *
 * @author Escinf
 */
public class Model {
    Dao personas;
    
    public Model(){
        personas = new Dao();        
    }

    public void agrear(Persona p) throws Exception{
        personas.PersonaAdd(p);
    }
    
    public Persona consultar(String id) throws Exception{
        Persona result= personas.PersonaGet(id);
        return result;
    }
  
    public List<Persona> buscar(String nombre){
       List<Persona> result= personas.PersonaSearch(nombre);
       return result;
    }
  public List<Estado> estadoBuscar() throws Exception{
      return personas.getEstado();
  }
    
    static Model the_instance;
    public static Model instance(){
        if (the_instance==null){
            the_instance = new Model();
        }
        return the_instance;
    }

    public void modificar(Persona persona) throws Exception {
       personas.PersonaUpdate(persona);
    }
}








