/*
 try{
}catch(){
}catch(){
}...//multiples bloques catch 
finally{//siempre se ejecuta, AYUDA A GUARDAR DATOS EN CASO QUE EL PROGRMA SE CIEERE
}
 */

package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un dato entero: ");
        int valor = input.nextInt();
        System.out.println("El valor es " + valor);
        }catch(InputMismatchException e) {
            e.printStackTrace();
        }finally{//ESTA SECCION SIMRPE SE EJECUTA
        System.out.println("ESTA LINEA SIEMPRE DEBE EJECUTARSE");
        }
        System.out.println("FIN DEL PROGRMA");
    }
    
}
