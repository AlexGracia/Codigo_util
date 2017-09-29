package alex;

import javax.swing.JOptionPane;

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

        //<editor-fold defaultstate="collapsed" desc="Numero entero">
        // Pido los datos al usuario
        String textoIntroducido = JOptionPane.showInputDialog(null, "Introduzca un numero:");

        // Muestro el veredicto en forma de mensaje por consola.
        System.out.println(textoIntroducido + " es un numero: " + StringOrNumber.isNumber(textoIntroducido));

        /* Ya puedo manejar el dato introducido por el usuario,
        * sin que salten excepciones.*/
        if (StringOrNumber.isNumber(textoIntroducido)) {
            Integer.parseInt(textoIntroducido);
        }
        //</editor-fold>

        // TODO: mostrar posible implementacion del metodo StringOrNumber.isDecimal()
        //<editor-fold defaultstate="collapsed" desc="Numero decimal">
        // Pido los datos al usuario
        String textoIntroducido2 = JOptionPane.showInputDialog(null, "Introduzca un numero:");
        Double.parseDouble(textoIntroducido2);
        //</editor-fold>
    }

}
