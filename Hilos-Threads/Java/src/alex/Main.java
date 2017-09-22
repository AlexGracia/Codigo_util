package alex;

/**
 * Clase principal desde la que se ejecuta el programa.
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el objeto
        Hilo h = new Hilo();
        // Empiezo la ejecucion del hilo
        h.start();
    }

}
