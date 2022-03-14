/*
 * 
 */
package eva1_13_access_modifiers;

import VEHICULOS_SIN_MOTOR.Bicicletas;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_13_ACCESS_MODIFIERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miCarro = new Automovil();
        miCarro.setAño(200);
        miCarro.imprimirMensaje();
        Bicicletas miBici = new Bicicletas();
        Carreta miCarreta = new Carreta();
        
    }
    
}
