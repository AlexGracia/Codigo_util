package alex;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que hereda de Thread y se ejecuta 10 veces.
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class Hilo extends Thread {

    // Variables
    private static final long SEGUNDO = 1000;
    private long contador;

    public Hilo() {
        super();
        contador = 0;
    }

    @Override
    public void run() {
        // Este hilo se ejecuta 10 veces
        while (contador < 10) {
            try {
                System.out.println(contador++ + ".- Me ejecuto cada segundo.");
                // Paro durante un segundo la ejecucion del hilo
                sleep(SEGUNDO);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
