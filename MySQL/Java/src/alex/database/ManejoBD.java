package alex.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class ManejoBD {

    // Variables
    private ConexionMySQL objConexion;

    public ManejoBD() {
        // Crear objeto de la clase ConexionMySQL
        objConexion = new ConexionMySQL();

        // Abrir la conexion
        objConexion.abrirConexion();
    }

    // TODO: mostrar (select)
    public String mostrar() {
        ResultSet rs = _mostrarDatos("select * from nombre_tabla");
        String resultado = "";
        try {
            while (rs.next()) {
                resultado += "id: " + rs.getInt(0); // Columna id
                resultado += "\n"; // Salto de linea
                resultado += "nombre_columna: " + rs.getString(1); // Columna nombre_columna
                resultado += "\n"; // Salto de linea
            }
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println("Error mostrando los datos");
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error");
                System.out.println("Error cerrando el ResultSet");
            }
        }
        return resultado;
    }

    public void insertar(String valor) {
        String sql = "";
        sql += "insert into nombre_tabla (nombre_columna) values ('";
        sql += valor;
        sql += "')";
        _modificarBD(sql);
    }

    public void actualizar(String valor, String index) {
        String sql = "";
        sql += "update nombre_tabla set nombre_columna = '";
        sql += valor;
        sql += "' where id = ";
        sql += index;
        _modificarBD(sql);
    }

    public void borrar(String index) {
        String sql = "";
        sql += "delete from nombre_tabla where id = ";
        sql += index;
        _modificarBD(sql);
    }

    private ResultSet _mostrarDatos(String sql) {
        Statement stmt = null;
        ResultSet rs = null;
        try {

            stmt = ConexionMySQL.CONEXION.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println("Error ejecutando el select");
        } finally {
            try {
                rs.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Error");
                System.out.println("Error cerrando el ResultSet o el Statement");
            }
        }

        return rs;

    }

    private void _modificarBD(String sql) {
        Statement stmt = null;
        try {

            stmt = ConexionMySQL.CONEXION.createStatement();
            int n = stmt.executeUpdate(sql);
            if (n > 0) {
                System.out.println("La base de datos ha sido modificada.");
            }

        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println("Error ejecutando la actualizacion de la BD.");
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Error");
                System.out.println("Error cerrando el Statement");
            }
        }
    }

}
