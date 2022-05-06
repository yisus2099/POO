/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_polimorfismo_int;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_17_POLIMORFISMO_INT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
      Prueba prueba = new Prueba();  
     /* prueba.mostrarMensajes("HOLA MUNDO");
      prueba.otroMetodo();*/
    mostrar(prueba);    
      
    }
    public static void mostrar(Mensajes m){
        m.mostrarMensajes("Hola mundo");
    }
    
}
