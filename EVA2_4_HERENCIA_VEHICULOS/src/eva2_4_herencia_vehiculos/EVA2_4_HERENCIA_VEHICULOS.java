/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_herencia_vehiculos;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_4_HERENCIA_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vehi1 = new Vehiculo();
        vehi1.imprimirDatos();
        Motocicleta moto1 = new Motocicleta();
        moto1.imprimirDatos();
        Automovil auto1 = new Automovil();
        auto1.imprimirDatos();
        Camioneta camione1 = new Camioneta();
        camione1.imprimirDatos();
        Camion camion1 = new Camion();
        camion1.imprimirDatos();
        
        
    }
    
}


class Vehiculo {
  private String tipoDeCombustible;
  private int numLlantas;
  private int capacidadMotor;
  private int cilindrosMotor;
  private int capacidadPasajeros;
  private String marca;
  private String modelo;
  private int año; 

    public Vehiculo(){//Constructor default
        this.tipoDeCombustible = "";
        this.numLlantas = 0;
        this.capacidadMotor = 0;
        this.cilindrosMotor = 0;
        this.capacidadPasajeros = 0;
        this.marca = "";
        this.modelo = "";
        this.año = 0;
    }
    
    public Vehiculo(String tipoCombustible, int numLlantas, int capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año) {
        this.tipoDeCombustible = tipoCombustible;
        this.numLlantas = numLlantas;
        this.capacidadMotor = capacidadMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    
    public void imprimirDatos() {
        System.out.println("Tipo de combustible : " + tipoDeCombustible);
        System.out.println("Numero de llantas: " + numLlantas);
        System.out.println("Capacidad del motor: " + capacidadMotor);
        System.out.println("Cilindros del motor: " + cilindrosMotor);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Marca: " + marca);
        System.out.println("Modleo: " + modelo);
        System.out.println("Año: " + año);
    }
}

class Motocicleta extends Vehiculo {
    private String tipoMotocicleta;
    private String tipoAsiento;
    private String compartimentoDeCarga;

   
    public Motocicleta() {
    super();
    this.tipoMotocicleta = "";
    this.tipoAsiento = "";
    this.compartimentoDeCarga = "";
}

    public Motocicleta(String tipoMotocicleta, String tipoAsiento, String compartimentoDeCarga) {
        super();
        this.tipoMotocicleta = tipoMotocicleta;
        this.tipoAsiento = tipoAsiento;
        this.compartimentoDeCarga = compartimentoDeCarga;
    }

    
    @Override
    public void imprimirDatos() {
      super.imprimirDatos();
        System.out.println("Tipo de motocilceta: " + tipoMotocicleta);
        System.out.println("Tipo de asiento: " + tipoAsiento);
        System.out.println("Compartimento de carga: " + compartimentoDeCarga);
    } 
}

class Automovil extends Vehiculo {
    private String tipoDeCarro;
    private String equipamiento;
    private String transmision;
    
    public Automovil() {
    super();
    this.tipoDeCarro = "";
    this.equipamiento = "";
    this.transmision = "";
    }

    public Automovil(String tipoDeCarro, String equipamiento, String transmision) {
        super();
        this.tipoDeCarro = tipoDeCarro;
        this.equipamiento = equipamiento;
        this.transmision = transmision;
    }

    
    @Override
  public void imprimirDatos() {
      super.imprimirDatos();
        System.out.println("Tipo de carro: " + tipoDeCarro);
        System.out.println("Equipamiento: " + equipamiento);
        System.out.println("Transmision: " + transmision);
      
  }
}



class Camioneta extends Vehiculo {
    private int capacidadDeCarga;
    private int puertas;
    private String tipoDeCarroceria;
    
    public Camioneta(){
    super();
    this.capacidadDeCarga = 0;
    this.puertas = 0;
    this.tipoDeCarroceria = "";
    }

    public Camioneta(int capacidadDeCarga, int puertas, String tipoDeCarroceria) {
        super();
        this.capacidadDeCarga = capacidadDeCarga;
        this.puertas = puertas;
        this.tipoDeCarroceria = tipoDeCarroceria;
    }

    
    @Override
 public void imprimirDatos() {
     super.imprimirDatos();
     System.out.println("Capacidad de carga: " + capacidadDeCarga);
     System.out.println("Puertas: " + puertas);
     System.out.println("Tipo de carroceria: " + tipoDeCarroceria);
    }
    }


    class Camion extends Vehiculo{
    private int pesoSoportado;
    private int numeroDeEjes;
    private int numeroDePisos;
    
    public Camion() {
    super();
    this.pesoSoportado = 0;
    this.numeroDeEjes = 0;
    this.numeroDePisos = 0;
    }

    public Camion(int pesoSoportado, int numeroDeEjes, int numeroDePisos) {
        super ();
        this.pesoSoportado = pesoSoportado;
        this.numeroDeEjes = numeroDeEjes;
        this.numeroDePisos = numeroDePisos;
    }
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Peso soportado: " + pesoSoportado);
        System.out.println("Numero de ejes: " + numeroDeEjes);
        System.out.println("Numero de pisos: " + numeroDePisos);
    }
    
    
}