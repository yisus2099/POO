
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*

 excepciones -- son del programa
 DESVIACIONES DEL FLUJO NORMAL DEL PROGRAMA
 TERMINA EL PROGRAMA
 SE PROPAGAN
 COMO CONTROLAR LAS EXCEPCIONES
 Si no saben controlar las excepciones, no lo hagan
 errores -- son del so

 */
/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EXCEPCIONES --> OBJETOS
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad (numero entero)");
        int iedad= 0;
        try{//codigo que puede fallar
        iedad = input.nextInt();
        }catch(InputMismatchException e){// codigo que sejecutamos si ocurre una falla
          //e.printStackTrace();
            System.out.println("Uops!! Fallo la captura!!");
        }
        System.out.println("Tu edad: " + iedad);
        
}
}