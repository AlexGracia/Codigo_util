package alex;

import java.io.IOException;

/**
 * Clase principal desde la cual se ejecuta el codigo de la clase
 * EscribirEnFichero.
 *
 * @author Alex Gracia
 * @version 1.0
 * @date 27-abr-2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="Variables">
        final EscribirEnFichero fichero;
        final String nombreFichero = "Fichero.txt";
        String texto;
        //</editor-fold>

        // Codigo a probar.
        try {

            fichero = new EscribirEnFichero(nombreFichero, true);
            texto = "\nHello World.";
            fichero.añadir(texto);
            fichero.cerrar();

        } catch (IOException ioe) {
            System.out.println("Ha ocurrido un error.");
            System.out.print(ioe.getMessage());
        }
    }

}
