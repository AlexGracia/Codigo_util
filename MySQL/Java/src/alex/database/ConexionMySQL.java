package alex.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que abre una conexion a MySQL.
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class ConexionMySQL {

    // Variables
    private final String database,
            urlJDBC,
            user,
            pass;
    private Connection conexion;

    // Constructor
    public ConexionMySQL() {
        database = "nombre_BD";
        // url JDBC mas completa, jdbc:mysql://localhost:3306/nombreBD
        urlJDBC = "jdbc:mysql:///" + database;
        user = "root";
        pass = "";
    }

    /**
     * Metodo que abre y devuelve la conexion a MySQL
     *
     * @return conexion
     */
    public Connection getConexion() {
        try {

            // Cargar el Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Crear enlace hacia la base de datos
            conexion = DriverManager.getConnection(urlJDBC, user, pass);

        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error");
            System.out.println("No se puede encontrar la clase Driver");
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println("Error conectando a MySQL");
        }

        return conexion;
    }

    /**
     * Metodo que cierra la conexion a MySQL
     */
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println("Error cerrando la conexion a MySQL");
        }
    }
}
