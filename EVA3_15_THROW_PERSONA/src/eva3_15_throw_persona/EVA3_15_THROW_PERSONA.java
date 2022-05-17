/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_15_throw_persona;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_15_THROW_PERSONA {

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
                if ((iedad >= 0) && (iedad <= 130))
                    System.out.println("Tu edad es: " + iedad);
 
                else{
                    datoErroneo = false;
                    throw new Exception("Rango de edad incorrecto!!");
                    
                    }
            } catch (InputMismatchException e) {
                System.out.println(input.next() + " no es un número válido");
            } catch (Exception e){
                System.out.println("Edad no valida");
            }

        } while (datoErroneo);
    }
    
}
