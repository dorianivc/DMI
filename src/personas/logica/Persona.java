/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.logica;

import personas.presentacion.listado.Estado;

/**
 *
 * @author Escinf
 */
public class Persona {
    String id;
    String nombre;
    char sexo;
    Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Persona(String id, String nombre,char sexo, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.sexo=sexo;
        this.estado=estado;
    }

    public Persona() {
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean esNacional(){
     String ced= this.id;
     char aux= ced.charAt(0);
     int val=Character.getNumericValue(aux);
     
        return (val>=0&&val<=7);
    }
    
    
}
