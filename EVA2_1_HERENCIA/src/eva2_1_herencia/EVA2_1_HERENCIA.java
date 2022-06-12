/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_herencia;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona perso1 = new Persona();
        //perso1.
        Estudiante estu1 = new Estudiante ("JUANA", 22, "00112255");
        /*estu1.setNombre("JUANA");
        estu1.setNumeroControl("00112233");
        estu1.setEdad(22);
        estu1.mostrarNombre();*/
        //System.out.println("No de control: " + estu1.getNumeroControl());
        estu1.imprimirDatos();
        
        Maestro mtro1 = new Maestro("MODRIC", 22, 132245);
        mtro1.imprimirDatos();
}
    
}
//Subclase Maestro
//Extends --> IS-A --> Maestros ES-UNA Persona
class Maestro extends Persona{
    //NO_DE_REGISTRO_ENTERO
    private int  numRegistro;

    public Maestro() {
        super();
    }
    
    public Maestro(String Nombre, int edad, int numRegistro) {
        super(Nombre, edad);
        this.numRegistro = numRegistro;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();//Estoy llamando al método imprimirDatos de persona (SUPERCLASE) 
        System.out.println("No. de registro: " + numRegistro);
    }
    
    
}

//Subclase hijo
//Extends --> IS-A --> Estudiante ES-UNA Persona
class Estudiante extends Persona{
    private String numeroControl;
    
    //Constructor default
    public Estudiante(){
        super(); //Llamada al constructor de la superclase
        System.out.println("Clase estudaiante");
    }
    public Estudiante(String Nombre, int edad, String numeroControl ){
        super(Nombre, edad);//Llamada al constructor de la superclase
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    /*
    public void mostrarNombre(){
        System.out.println("Nombre del estudiante: " + getNombre());
    }
*/
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();//Estoy llamando al método imprimirDatos de persona (SUPERCLASE) 
        System.out.println("No. de control: " + numeroControl);
    }
}
class Persona{//Super clase padre

    private String nombre;
    private int edad;
    
    public Persona (){
        this.nombre = "XXXXX";
        this.edad = 10000;
        System.out.println("Clase persona");
    }
    
    public Persona(String Nombre, int edad) {
        this.nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
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