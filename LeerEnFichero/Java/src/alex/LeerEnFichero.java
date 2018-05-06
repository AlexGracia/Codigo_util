package alex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que sirve para leer el contenido de un fichero de texto, poniendo en
 * practica el metodo <code>read()</code> de la clase FileReader.
 *
 * @author Alex Gracia
 * @version 1.0
 * @date 06-may-2018
 */
public class LeerEnFichero extends FileReader {

    /**
     * El siguiente metodo es el constructor de la clase mediante el cual se
     * especifica el nombre del fichero a leer.
     *
     * @param fileName
     * @throws FileNotFoundException
     */
    LeerEnFichero(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    /**
     * Metodo que lee el contenido del fichero.
     *
     * @return caracter leido en codigo ASCII
     * @throws IOException
     */
    int leer() throws IOException {
        return super.read();
    }

    /**
     * Metodo que cierra el fichero.
     *
     * @throws IOException
     */
    void cerrar() throws IOException {
        super.close();
    }

}
