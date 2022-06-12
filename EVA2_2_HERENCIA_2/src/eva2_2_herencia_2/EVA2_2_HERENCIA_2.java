/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_herencia_2;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_2_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    /*
    is a --> es un
    has a --> tiene un 
 
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dire = new Direccion("5ta", 100, "X", "011", "Chihuahua", "Chihuahua", "03445506");
        Estudiante estu1 = new Estudiante("Alex", 18, "0333665", dire);
        estu1.imprimirDatos();
    }
    
}

class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void imprimirDireccion() {
        System.out.println("Calle " + calle + " #" + 
                numero + ", col." + colonia + "\n, CP: " + 
                cp + ", en" + ciudad + ", " + estado);
    }
    
    
}

//Relacion IS AS --> Estudiante Es una Persona
class Estudiante extends Persona{
    private String numControl;
    //Esto es un objeto, pero sin instanciar, lo vamos a instanciar en el constructor
    private Direccion direccion; //HAS-A --> Estudiante TIENE UNA direccion

    public Estudiante() {//Inicializar
        super();
        this.numControl = "";
        //Instanciar DIRECCION
        direccion = new Direccion();
    }

    public Estudiante(String nombre, int edad, String numControl, Direccion direccion) {
        super(nombre, edad);
        this.numControl = numControl;
        this.direccion = direccion;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Número de control: " + numControl);
        super.imprimirDatos();
        direccion.imprimirDireccion();
    }
    
    
    
}

class Persona{
    private String nombre;
    private int edad;
    
    public Persona(){//Constructor default
      this.nombre = " ";
       this.edad = 0;
        
    }

    public Persona(String nombre, int edad) { //Constructor con argumentos
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
