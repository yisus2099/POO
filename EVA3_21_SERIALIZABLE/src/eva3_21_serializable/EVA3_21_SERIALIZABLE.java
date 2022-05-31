
package eva3_21_serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_21_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Binarios y de texto
        //ESPECIFICAR QUE OBJETOS (CLASES) SON SERIALIZABLES
        //DEBEMOS HACER QUE LA CLASE IMPLEMENTE LA INTERFAZ SERIALIZABLE
        Persona persona = new Persona("Pedro", "Páramo");
        escribirObj(persona);
    }
    
    //GUARDAR OBJETOS
    public static void esribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/ARCHIVOS/archivo3.obj");
            try {
                ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
                guardarObj.writeObject(obj);
                guardarObj.flush();
                guardarObj.close();
            } catch (IOException ex) {
                Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //LEER OBJETOS
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}