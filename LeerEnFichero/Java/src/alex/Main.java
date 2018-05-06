package alex;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Clase principal desde la que se ejecuta el codigo de la clase LeerEnFichero.
 *
 * @author Alex Gracia
 * @version 1.0
 * @date 06-may-2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="Variables">
        final LeerEnFichero fichero;
        final String nombreFichero = "Fichero.txt";
        final char enter = 13;
        int caracterASCII;
        char caracter;
        //</editor-fold>

        try {
            fichero = new LeerEnFichero(nombreFichero);

            // Mientras hay texto
            while ((caracterASCII = fichero.leer()) != -1) {
                caracter = (char) caracterASCII;

                if (caracterASCII != enter) {
                    System.out.print(caracter);
                } else {
                    System.out.println(caracter);
                }
            }
            fichero.cerrar();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
