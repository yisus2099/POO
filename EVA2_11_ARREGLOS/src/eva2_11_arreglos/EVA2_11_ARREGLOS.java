/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_arreglos;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLOS:
        //FILA O COLUMNA DE EXCEL
        //ALMACENAN DATOS DEL MISMO TIPO
        //SE PUEDEN ACCEDER POR ÍNDICES
        //JAVA: PRIMER POSICION:0, ULTIMA: CANTIDAD DE ELEMENTOS - 1
        //JAVA: ARREGLOS SON OBJETOS
        
        int [] arreglo = new int[10];
        //como los usamos?
        arreglo[0] = 100; //El arreglo en la posicion 0, se le asigna 10
        System.out.println("El vvalor de arreglo [0]= " + arreglo[0]);
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        arreglo[9] = 1000; //Ultima posicion
        //Arreglo[10] = 200; //Aqui nos pasamos del arreglo
        System.out.println(arreglo);
        System.out.println("Tamaño del arreglo: " + arreglo.length);
        String[] arreCade = new String[10];
        arreCade[5] = "Hola mundo";
        double[] arreDouble = new double[1000000];
        arreDouble[999999] = 0.2;
        Persona[] clasePOO = new Persona[32]; //Arreglo para 32 objetos de tipo Persona
    }
    
}

class Persona {
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
