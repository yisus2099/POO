/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true; //El usuario siempre se equivoca
        Scanner input = new Scanner(System.in);
        do {
            try {

                System.out.println("Introduce tu edad(numero entero): ");
                int iedad = input.nextInt();
                datoErroneo = false;
                System.out.println("Tu edad es: " + iedad);
            } catch (InputMismatchException e) {
                System.out.println(input.next() + " no es un número válido");
            }

        } while (datoErroneo);
    }
}
