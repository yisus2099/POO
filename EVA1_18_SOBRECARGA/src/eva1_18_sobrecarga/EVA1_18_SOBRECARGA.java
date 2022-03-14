/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecarga;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_18_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOLA MUNDO");
        Prueba obj = new Prueba ();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Área de un rectangulo de 15 x 20: " + calcularArea(15, 20));
        System.out.println("Área de un rectangulo de 15 x 20: " + calcularArea(15.0, 20.0, 1));
        System.out.println("Área de un círculo de radio 100: " + calcularArea(100.0));
        System.out.println("Área de un círculo de radio 100: " + calcularArea(100));
    }
    //Calcula el área de un rectangulo
    public static double calcularArea(double largo, double ancho) {
        return largo * ancho;
    }
     //Calcula el área de un triangulo
    public static double calcularArea(double base, double altura, int esTriangulo){
        return (base * altura)/2;
    }
    
     //Calcula el área de un circulo
    public static double calcularArea(double radio){
         System.out.println("Double");
        return Math.pow(radio, 2);
    }
     //Calcula el área de un circulo con enteros
    public static double calcularArea(int radio){
        System.out.println("Entero");
        return Math.pow(radio, 2);
    }
}


class Prueba{
    
}