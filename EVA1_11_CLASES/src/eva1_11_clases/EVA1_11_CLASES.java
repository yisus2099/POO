package eva1_11_clases;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_11_CLASES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Persona{
    //Atributos de la clase
    private String id;
    private String nombre;
    private int edad;

    public String getId() {
        return id;
    }
    
    //this --> este
    //apuntador --> al objeto actual
    public void setId(String id) {
        this.id = id;
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
}
