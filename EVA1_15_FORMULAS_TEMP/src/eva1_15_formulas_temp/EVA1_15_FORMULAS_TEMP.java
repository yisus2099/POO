/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa grados celsius: ");
        double celcius = entrada.nextDouble();
        System.out.println("Ingresa grados fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        System.out.println("Ingresa grados kelvin: ");
        double kelvin = entrada.nextDouble();
        
        double conv = FormulasTemp.celsAfahr(celcius);
        System.out.println("Celcius a fahrenheit: " + conv);
        
        double conv1 = FormulasTemp.celsAkelv(celcius);
        System.out.println("Celcius a kelvin: " + conv1);
        
        double conv2 = FormulasTemp.fahrAcels(fahrenheit);
        System.out.println("Fahrenheit a celcius: " + conv2);
        
        double conv3 = FormulasTemp.fahrAkelv(fahrenheit);
        System.out.println("Fahrenheit a kelvin: " + conv3);
        
        double conv4 = FormulasTemp.kelvAfahr(kelvin);
        System.out.println("Kelvin a fahrenheit: " + conv4);
        
        double conv5 = FormulasTemp.kelvAcels(kelvin);
        System.out.println("Kelvin a celcius: " + conv5);
 
        
    }
    
}

class FormulasTemp {
    //C - F
    public static double celsAfahr (double cels){
        double conv;
        conv = (cels * 1.8) + 32;
        return conv;
    }
    
    //C - K
    public static double celsAkelv (double cels){
        double conv1;
        conv1 = cels  + 273.15;
        return conv1;
    }
    
    //F - C
    public static double fahrAcels (double fahr){
        double conv2;
        conv2 = (5*(fahr - 32))/9;
        return conv2;
    }
    
     //F - K
    public static double fahrAkelv (double fahr){
        double conv3;
        conv3 = ((5*(fahr - 32))/9)+273.15;
        return conv3;
    }
    
     //K - F
    public static double kelvAfahr (double kelv){
        double conv4;
        conv4 = ((9*(kelv - 273.15))/5)+ 32;
        return conv4;
    }
         //K - C
    public static double kelvAcels (double kelv){
        double conv5;
        conv5 = kelv - 273.15;
        return conv5;
    }
    
}
