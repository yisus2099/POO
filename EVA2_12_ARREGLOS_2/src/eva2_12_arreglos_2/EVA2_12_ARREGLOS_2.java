/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_12_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloEdad = new int[32];//bytes ocupa un entero
        Scanner input = new Scanner(System.in);
        //32 capturas --> for
        //CAPTURA DE DATOS
        for(int i=0; i<32; i++){ //i -- Index --> Indice
            System.out.println("¿Cuál es tu edad?");
            arregloEdad[i] = input.nextInt();
        }
        //MOSTRAR LOS DATOS
        for (int i = 0; i < 32; i++) {
            System.out.print("[" + arregloEdad[i] + "]");
            
        }
    }
    
}
