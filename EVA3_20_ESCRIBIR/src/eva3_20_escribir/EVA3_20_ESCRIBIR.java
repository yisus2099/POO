
package eva3_20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            // TODO code application logic here
            Path ruta = Paths.get("c:/Archivo/frac.txt");
            OutputStream abrirArch;
            OutputStreamWriter escribirArch;
            BufferedWriter escribirTexto;
            
             try {
                 
            abrirArch  = Files.newOutputStream(ruta);
            escribirArch = new  OutputStreamWriter (abrirArch);
            escribirTexto = new BufferedWriter(escribirArch);
            escribirTexto.write("Hola mundo");
            escribirTexto.newLine();
            escribirTexto.write("La champios");
             escribirTexto.newLine();
            escribirTexto.write("courtois es dios");
             escribirTexto.newLine();
            escribirTexto.write("Dune");
            escribirTexto.flush();//Hcer Permanentes los cambios
            escribirTexto.close();//Siempre hay que cerrar el stream
        } catch (IOException ex) {
            ex.printStackTrace();
        }
                    
        
    }
    
}
