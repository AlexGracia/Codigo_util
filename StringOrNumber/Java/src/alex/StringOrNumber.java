package alex;

/**
 * Clase que comprueba si un String es texto o número.
 *
 * @author Alex Gracia
 * @version 1.0
 */
public class StringOrNumber {

    public static boolean isNumber(String texto) {
        boolean veredicto = false;

        if (!_util(texto)) {
            return veredicto;
        }

        char[] caracteres = texto.toCharArray();

        for (int i = 1; i < caracteres.length; i++) {
            if (!Character.isDigit(caracteres[i])) {
                return veredicto;
            }
        }

        veredicto = true;

        return veredicto;
    }

    // TODO: metodo isDecimal.
    public static boolean isDecimal(String texto) {
        boolean veredicto = false;

        if (!_util(texto)) {
            return veredicto;
        }

        char[] caracteres = texto.toCharArray();

        return veredicto;
    }

    /**
     * Metodo que comprueba si el texto pasado por parametro esta vacio o es
     * distinto de '-' y '+'
     *
     * @param texto
     * @return
     */
    private static boolean _util(String texto) {
        boolean veredicto = false;

        // Compruebo si el String esta vacio
        if (texto.isEmpty()) {
            return veredicto;
        }

        // Compruebo si el primer caracter es igual a '-' o '+'
        char primerCaracter = texto.charAt(0);
        if (!Character.isDigit(primerCaracter)) {
            if (primerCaracter != '-' && primerCaracter != '+') {
                return veredicto;
            }
        }

        veredicto = true;

        return veredicto;
    }
}
