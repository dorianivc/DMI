/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.presentacion.edicion;

import java.util.logging.Level;
import java.util.logging.Logger;
import personas.logica.Persona;

/**
 *
 * @author Escinf
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) throws Exception {
        this.model = model;
        model.setEstados(personas.logica.Model.instance().estadoBuscar());
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }
    
    public void consultar(String id){
        try {
            model.setPersona(personas.logica.Model.instance().consultar(id));
        } catch (Exception ex) {
            model.setPersona(new Persona(id,"NO EXISTE!!!",'M'));
        }
    }
    
    public void agregar(Persona p){
        try {
            personas.logica.Model.instance().agrear(p);
            model.setPersona(new Persona("","",'I'));
        } catch (Exception ex) {

        }
    }

    void modificar(Persona persona) {
        try {
        personas.logica.Model.instance().modificar(persona);
        personas.Application.listadoController.buscar(persona.getNombre());
        }catch(Exception ex){
        }
        
    }
    
}











