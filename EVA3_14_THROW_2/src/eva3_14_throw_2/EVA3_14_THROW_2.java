/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_14_throw_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona= new Persona();
        persona.setNombre("Juan perez");
        try {
            persona.setEdad(15);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
        try {
            Persona persona2 = new Persona("Juan perez", 50);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

class Persona {

    private String nombre;
    private int edad;

    public Persona(){
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if ((edad >= 0) && (edad <= 130)) {
            this.edad = edad;
        } 
    else {
    throw new Exception("Rango de edad incorrecto!!");

        }
    }
}

//Sigue capturar la practica 13 en la 14 en eva 3 15q