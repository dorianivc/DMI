/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.presentacion.listado;

import java.util.Objects;

public class Estado {
    public String estado;
    public String descripcion;

   
                
    public String getEstado() {
        return estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    public boolean equals(String cod) {
        return cod.equals(estado);
    }

    @Override
    public String toString() {
        return descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado(String estado, String descripcion) {
        this.estado = estado;
        this.descripcion = descripcion;
    }
    
}
