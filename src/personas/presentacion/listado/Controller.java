/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.presentacion.listado;

import com.sun.glass.ui.Application;
import personas.presentacion.edicion.*;




/**
 *
 * @author Escinf
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }
    
    public void buscar(String nombre){
        model.setPersonas(personas.logica.Model.instance().buscar(nombre));
    }

    void editar(int row) {
    personas.Application.edicioncontroller.consultar(model.getPersonas().get(row).getId());
    }

}











