
package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *ARCHIVOS:
Dos tipos de archivo:
	archivos de texto
	archivos binarios
 * @author Jesús Alejandro Torres Ramírez
 * STEAM --> Torrente --> Flujo de bytes 
 *
 * bytes
 */
public class EVA3_18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try{
        // TODO code application logic here
        //RUTA:
        //FileInputSream
        FileInputStream archivo = new FileInputStream("c:/Archivos/atreidis.txt");
        int caracter;
      do {
         System.out.println((char) archivo.read());
         caracter = archivo.read();
        } while (caracter != -1 );
   
    } catch(FileNotFoundException ex){
    ex.printStackTrace();
    }   catch (IOException ex) {
            ex.printStackTrace();
        }
    
}
}