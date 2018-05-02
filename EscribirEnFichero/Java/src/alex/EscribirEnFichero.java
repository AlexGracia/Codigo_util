package alex;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que sirve para escribir texto en un fichero de forma añadida, poniendo
 * en practica el metodo <code>append(CharSequence csq)</code> de la clase
 * FileWriter.
 *
 * @author Alex Gracia
 * @version 1.1
 * @date 27-abr-2018
 * @see FileWriter
 */
public class EscribirEnFichero extends FileWriter {

    /**
     * Constructor que sirve para especificar el nombre del fichero y si se
     * puede añadir texto.
     *
     * @param fileName
     * @param append
     * @throws IOException
     * @since 1.1
     */
    EscribirEnFichero(String fileName, boolean append) throws IOException {
        super(fileName, append);
    }

    /**
     * Metodo que sirve para añadir un texto en el fichero.
     *
     * @param texto
     * @throws IOException
     * @since 1.0
     */
    void añadir(String texto) throws IOException {
        super.append(texto);
    }

    /**
     * Metodo que sirve para cerrar el fichero.
     *
     * @throws IOException
     * @since 1.0
     */
    void cerrar() throws IOException {
        super.close();
    }

}
