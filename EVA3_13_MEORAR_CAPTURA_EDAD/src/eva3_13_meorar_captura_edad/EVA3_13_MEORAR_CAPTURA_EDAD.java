/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_meorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_13_MEORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Introduce tu edad (numero entero)");
        int iedad= input.nextInt();
        if (iedad < 0)
        throw new Exception("");
        }catch(){
            
        }
        System.out.println("Tu edad: " + iedad);
        
    }
    
}
