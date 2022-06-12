/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_13_ARREGLOS_4 {
//Constantes en java
    public static final int TAMA = 32;
    //final --> sirve para declarar constantes
    //final --> solo permite asignar una vez un valor
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] arregloEdad = new int[TAMA];//bytes ocupa un entero --> 4 bytes
    System.out.println("Tamaño de arregloEdad: " + arregloEdad.length);
    Scanner input = new Scanner(System.in);
    
    //32 capturas --> for
    //CAPTURA DE DATOS
    for (int i = 0; i < TAMA; i++) {//i --> index --> índice
    System.out.println("Cuál es tu edad? ");
    arregloEdad[i] = input.nextInt();
    }
    
    //MOSTRAR LOS DATOS
    for (int i = 0; i < TAMA; i++) {
    System.out.print("[" + arregloEdad[i] + "]");
}
    }
    
}
