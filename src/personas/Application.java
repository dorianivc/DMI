/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import personas.presentacion.edicion.Controller;
import personas.presentacion.edicion.Model;
import personas.presentacion.edicion.View;



/**
 *
 * @author Escinf
 */
public class Application {
    
    public static personas.presentacion.edicion.Controller edicioncontroller=null;
    public static  personas.presentacion.listado.Controller listadoController=null;
    
    public static void main(String[] args) throws Exception {
        personas.presentacion.edicion.Model edicionModel=
                new personas.presentacion.edicion.Model() ;
        personas.presentacion.edicion.View edicionView = 
                new personas.presentacion.edicion.View();
       edicioncontroller = 
                new personas.presentacion.edicion.Controller(edicionModel,edicionView);
        edicionView.setVisible(true); 
        
        personas.presentacion.listado.Model listadoModel=new personas.presentacion.listado.Model() ;
        personas.presentacion.listado.View listadoView = new personas.presentacion.listado.View();
         listadoController = new personas.presentacion.listado.Controller(listadoModel,listadoView);
        listadoView.setVisible(true);         
    }
        
}
