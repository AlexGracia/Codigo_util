package alex.principal;

import alex.database.ConexionMySQL;
import java.sql.Connection;

/**
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objeto de la clase ConexionMySQL
        ConexionMySQL objConexion = new ConexionMySQL();

        // Abrir la conexion
        Connection conexion = objConexion.getConexion();

        // TODO: insertar, mostrar, modificar y borrar datos en la base de datos

        // Cerrar la conexion
        objConexion.cerrarConexion();
    }

}
