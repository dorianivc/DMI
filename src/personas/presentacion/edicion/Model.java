/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.presentacion.edicion;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import personas.logica.Persona;
import personas.presentacion.listado.Estado;

/**
 *
 * @author Escinf
 */
public class Model extends Observable{
    Persona persona;
   public List<Estado> estados;

    public Model() {
        persona=new Persona("","",'F');
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
        this.setChanged();
        this.notifyObservers();           
    }
    
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }

    void setEstados(List<Estado> estadoBuscar) {
        estados= estadoBuscar;
    }
    
}
