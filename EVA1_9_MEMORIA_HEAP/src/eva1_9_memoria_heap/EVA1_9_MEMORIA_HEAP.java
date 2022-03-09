package eva1_9_memoria_heap;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        Prueba obj1 = new Prueba ();
        System.out.println(obj1);
        System.out.println(obj1.valor);
        Prueba obj2 = new Prueba ();
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2 = null;//Elimino referencia, el garbage collector lo elimina
        //cuando no eliminan objetos y no se usan en el programa --> fuga de memoria (memory leak)
        System.out.println(obj2.valor);
    }
    
}
class Prueba{
    int valor = 100;
}
