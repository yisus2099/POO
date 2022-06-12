/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arreglos_3_obj;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_12_ARREGLOS_3_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] arregloPer = new Persona[10];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<10; i++){ //i -- Index --> Indice
            //Crear objeto:
            arregloPer[i] = new Persona();
            System.out.println("¿Cuál es tu nombre?");
            arregloPer[i].setNombre(input.nextLine());
            
        }
        //MOSTRAR LOS DATOS
        for (int i = 0; i < 32; i++) {
            System.out.print("[" + arregloPer[i] + "]");
    }
    
}
}
class Persona{
    private String nombre; 
        public Persona() {
        }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    }
    