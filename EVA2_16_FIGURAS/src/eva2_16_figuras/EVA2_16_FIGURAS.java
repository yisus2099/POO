/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_16_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo triangulo = new Triangulo(10, 15);
        Circulo circulo = new Circulo(20);
        Rectangulo rectangulo = new Rectangulo(20, 25);
        
        //System.out.println("Area = " + triangulo.calcularArea());
        imprimirArea(circulo);
           
    }
    public static void imprimirArea(Figura f) {
        System.out.println("Area = " + f.calcularArea());
        
    }
}

