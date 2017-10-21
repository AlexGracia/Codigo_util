package alex.principal;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Clase principal que ejecuta en paralelo un fichero externo al programa.
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "doc\\hi.bat";
        File fichero = new File(ruta);
        if (fichero.exists()) {
            try {
                Desktop.getDesktop().open(fichero);
            } catch (IOException ex) {
                System.out.println("Error");
            }
        } else {
            System.out.println("El fichero no existe.");
        }
    }

}
