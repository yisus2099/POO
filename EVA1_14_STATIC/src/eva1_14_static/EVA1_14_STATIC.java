/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_static;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciar la clase
        /*FormulasMatematicas misFor = new FormulasMatematicas();
        double area = misFor.calcularAreaCirculo(100);
        System.out.println("Área del círculo: " + area);*/
        double area = FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Área del circulo: " + area);
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Área del triangulo: " + areaT);
        FormulasMatematicas miObj = new FormulasMatematicas();
        miObj.imprimirMensaje();
        
    }
    
}

class FormulasMatematicas{
    
    static int valor = 100;
    //area de circulo:
    public static double calcularAreaCirculo(double radio){
        double area;
        area = 3.1416 * radio * radio;
        return area;
    }
    //Area triangulo
    public static double calcularAreaTriangulo(double base, double altura){
        double area;
        area = (base * altura) / 2.0;
        return area;
    }
    
    public void imprimirMensaje(){
        System.out.println("Hola mundo!!");
    }
}