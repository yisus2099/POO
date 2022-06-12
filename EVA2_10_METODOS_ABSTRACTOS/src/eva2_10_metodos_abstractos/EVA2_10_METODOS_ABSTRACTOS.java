/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_metodos_abstractos;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_10_METODOS_ABSTRACTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class ImplementaAbstracto extends ClaseAbstracta{

    @Override
    public void metodoAbstracto() {
       
    }
    
}
//METODO ABSTRACTO: SIN CUERPO (SIN IMPLEMENTACION, SIN LLAVES)
abstract class ClaseAbstracta{
    public void metodoImplementado(){
        System.out.println("Metodo implementado");
    }
    public abstract void metodoAbstracto();
}