/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_clase_computadora;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora com1 = new  Computadora( );
        com1.setMarca("Hp");
        com1.setProcesador("Intel core i7");
        com1.setRam(8);
        com1.setMemoria(1000);
        com1.setPrecio(80000.50);
        com1.imprimirDatos();
    }
}
class Computadora{
    private String marca;
    private String procesador;
    private int ram;
    private int memoria;
    private double precio;
    
    public void setMarca (String valor){
        marca = valor; 
    }
    public String getMarca( ){
        return marca;
    }
      public void setProcesador (String valor){
       procesador = valor; 
    }
    public String getProcesador( ){
        return procesador;
    }
      public void setRam (int valor){
       ram = valor; 
    }
    public int getRam( ){
        return ram;
    }
     public void setMemoria (int valor){
       memoria = valor; 
    }
    public int getMemoria( ){
        return memoria;
    }
  public void setPrecio (double valor){
       precio = valor; 
    }
    public double getPrecio( ){
        return precio;
    }
    public void imprimirDatos(){
       System.out.println("Datos de la computadora");
         System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria en gb: " + memoria);
        System.out.println("Ram en gb: " + ram);
        System.out.println("Precio: " + (precio+(precio*0.16)));
   }
}
