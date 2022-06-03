package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> miListaPerso = new ArrayList(); //Collections <TIPOS DE DATOS GENERICOS>
        //JAVA --> LISTAS, ARREGLOS, ETC: 0 --> N- 1
        miListaPerso.add(new Persona("Juan", "Perez"));//0
        miListaPerso.add(new Persona("Luis", "Miguel"));//1
        miListaPerso.add(new Persona("Alejandro", "Perez"));//2
        miListaPerso.add(new Persona("Florentino", "Perez"));
        escribirObj(miListaPerso);
        leerObj();

    }

    public static void escribirObj(Object obj) {

        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/ARCHIVOS/archivo3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void leerObj() {
        try {
            FileInputStream abrirArch = new FileInputStream("c:/ARCHIVOS/archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            ArrayList<Persona> miListaPerso = (ArrayList<Persona>) leerObjeto.readObject();//OBJETO (Class Object)
            
            for (int i = 0; i < miListaPerso.size(); i++) {
                Persona persona = miListaPerso.get(i);
                System.out.println("Nombre: " + persona.getNombre() + " | Apellido: " + persona.getApellido());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}

class Persona implements Serializable {

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
