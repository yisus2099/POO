/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_constructores;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        
        Persona persona2 = new Persona();
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        
        Persona persona3 = new Persona("Ruben", 40);
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        
        Persona persona4 = new Persona(5.0);
        System.out.println("Nombre: " + persona4.getNombre());
        System.out.println("Edad: " + persona4.getEdad());
    }
    
}
class Persona{
    private String nombre;
    private int edad;
    
    //Constructor Default <-- no me refiero al nivel acceso, me refiero a que no tiene (argumentos)
    //Inicializar valores
    public Persona() {
        System.out.println("Creando el objeto");
        nombre = "Juan Perez";
        edad = 100;
    }
    
    //Sobrecarga de métodos
    public Persona(String nombre, int edad){
        System.out.println("Creando el objeto con constructor que acepta valores");
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(double valor){
        System.out.println("Creando el objeto con constructor que acepta doubles");
        
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

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
