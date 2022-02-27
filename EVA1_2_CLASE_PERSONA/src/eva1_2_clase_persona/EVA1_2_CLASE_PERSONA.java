/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clase_persona;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_2_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // implementacion {}
        System.out.println("Hola mundo!!");
        //COMO CREAR UN OBJETO EN JAVA.
        //INSTANCIACIÓN: CREAR UN OBJETO
        //DAR MEMORIA --> new || C++ -- new, malloc
        Persona estudiante = new Persona();//declaro un identificador (objeto) tipo Persona
        estudiante.id = "00112233";
        estudiante.nombre = "Juan Perez Jolote";
        estudiante.edad = 10;
        estudiante.imprimirDatos();
        //CONCATENACION -> PEGAR CADENAS DE TEXTO
        //"   " + ENTERO/BOOLEANO/STRING/DOUBLE/ETC --> CADENA DE TEXTO
        System.out.println("Año de nacimiento: " + estudiante.calcularAñoNacimiento());
        
        Persona estudiante2 = new Persona();
        estudiante2.nombre = "Ruben";
        estudiante2.id = "11111";
        estudiante2.edad = 40;
        estudiante2.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante2.calcularAñoNacimiento());
        
        Persona estudiante3 = new Persona();
        estudiante3.nombre = "Pedro";
        estudiante3.id = "654654";
        estudiante3.edad = 50;
        estudiante3.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante3.calcularAñoNacimiento());
        
        System.out.println(estudiante.nombre);
        System.out.println(estudiante2.nombre);
              
    }
    
}

//UNA CLASE ES UN TIPO DE DATO ABSTRACTO
class Persona//Declaracion
{//Implementacion
  //ATRIBUTOS DE LA CLASE
  String id;
  String nombre;
  int edad;
  
  //COMPORTAMIENTO
  //Método imprimir datos ---> metodo/funcion ---> f(X)= x+1;
  //Valor de retorno + nombre de la función (argumentos)
  void imprimirDatos(){//No regresa valor, el nombre es imprimirDatos (no recibe valores)
      System.out.println("El nombre es: " + nombre);
      System.out.println("Su id es: " + id);
      System.out.println("Su edad es: " + edad);
  
}
  //Calcular año de nacimiento
  int calcularAñoNacimiento(){
      int añoNac = 2022 - edad;
      return añoNac;
  }
}
/*
Persona:
//DATOS --> ATRIBUTOS DE LA CLASE
ID: cadena
Nombre: Cadena
Edad: entero
Sexo: Char
direccion: cadena
telefono: cadena
estatura: real
curp: cadena
//COmportamiento
capturar datos
consultar datos
*/