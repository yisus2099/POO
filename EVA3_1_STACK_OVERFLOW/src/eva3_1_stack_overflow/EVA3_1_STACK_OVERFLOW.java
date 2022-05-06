/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_stack_overflow;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_1_STACK_OVERFLOW { //desbordamiento de pila (stack) ---> memoria
    //EEROR --> Fatales al progrma muerte segura
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        terminarStack();
    }
    
    //stack es la memora para variables locales y llamada
    //a funcion
    public static int c = 0;
    public static void terminarStack() {
        c = c + 1;
        System.out.println(c);
        terminarStack();
    }

}
