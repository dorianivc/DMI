/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.presentacion.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import personas.logica.Persona;

/**
 *
 * @author Escinf
 */
public class Model extends Observable{
    List<Persona> personas;

    public Model(List<Persona> personas) {
        this.personas = personas;
    }

    public Model() {
        personas = new ArrayList<>();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
        this.setChanged();
        this.notifyObservers();         
    }

    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }
    
}
