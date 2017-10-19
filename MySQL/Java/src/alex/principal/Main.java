package alex.principal;

import alex.database.ConexionMySQL;
import alex.database.ManejoBD;
import java.util.Scanner;

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

        // Crear objeto de la clase ManejoBD
        ManejoBD objManejoBD = new ManejoBD();

        // Crear objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);

        //<editor-fold defaultstate="collapsed" desc="Insertar dato">
        System.out.println("## Ejecutar un insert");

        // Pedir datos
        System.out.print("Introduzca un dato: ");
        String valor = sc.next();

        // Insertar un valor en la base de datos
        objManejoBD.insertar(valor);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Mostar datos">
        System.out.println("## Ejecutar un select");
        System.out.println(objManejoBD.mostrar());
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Actualizar dato">
        System.out.println("## Ejecutar un update");

        // Pedir datos
        System.out.print("Introduzca un id: ");
        String index = sc.next();

        System.out.print("Introduzca el nuevo dato: ");
        valor = sc.next();

        // Actualizar un valor en la base de datos
        objManejoBD.actualizar(valor, index);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Mostar datos">
        System.out.println("## Ejecutar un select");
        System.out.println(objManejoBD.mostrar());
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Borrar dato">
        System.out.println("## Ejecutar un delete");

        // Pedir datos
        System.out.print("Introduzca un id: ");
        index = sc.next();

        // Borrar un valor en la base de datos
        objManejoBD.borrar(index);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Mostar datos">
        System.out.println("## Ejecutar un select");
        System.out.println(objManejoBD.mostrar());
        //</editor-fold>

        // Cerrar la conexion
        ConexionMySQL.cerrarConexion();
    }

}
