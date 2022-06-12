/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_clases_abstractas;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Cliente extends Persona{
    private String RFC;

    public Cliente() {
    }

    public Cliente(String RFC) {
        this.RFC = RFC;
    }

    public Cliente(String RFC, String nombre, int edad) {
        super(nombre, edad);
        this.RFC = RFC;
    }
    
    
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("RFC: " + RFC);
    }
    
}
