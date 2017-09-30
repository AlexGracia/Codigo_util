package alex;

import java.util.Scanner;

/**
 * Clase principal desde la que compruebo el funcionamiento de la clase
 * StringOrNumber.
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //<editor-fold defaultstate="collapsed" desc="Numero entero">
        // Pido los datos al usuario
        System.out.print("Introduce un numero entero: ");
        String textoIntroducido = sc.next();

        // Muestro el veredicto en forma de mensaje por consola.
        System.out.println(textoIntroducido + " es un numero: "
                + StringOrNumber.isNumber(textoIntroducido));

        /* Ya puedo manejar el dato introducido por el usuario,
        * sin que salten excepciones.*/
        if (StringOrNumber.isNumber(textoIntroducido)) {
            Integer.parseInt(textoIntroducido);
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Numero decimal">
        // Pido los datos al usuario
        System.out.print("Introduce un numero decimal: ");
        textoIntroducido = sc.next();

        // Muestro el veredicto en forma de mensaje por consola.
        System.out.println(textoIntroducido + " es un numero decimal: "
                + StringOrNumber.isDecimal(textoIntroducido));

        if (StringOrNumber.isDecimal(textoIntroducido)) {
            Double.parseDouble(textoIntroducido);
        }
        //</editor-fold>
    }

}
