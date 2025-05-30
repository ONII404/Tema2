package Ejercicios.Parte3_21_25;

import java.util.Scanner;

/**
 * 22. Establece un programa con una función recursiva que elimine todos los
 * espacios en blanco de una cadena de texto.
 *
 * @author beehr
 */
public class Act22_EliminarEspacios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        String resultado = eliminarEspacios(texto);
        System.out.println("Cadena sin espacios: " + resultado);
    }

    public static String eliminarEspacios(String texto) {
        if (texto.isEmpty()) {
            return "";
        }

        char primero = texto.charAt(0);
        String resto = eliminarEspacios(texto.substring(1));

        if (primero == ' ') {
            return resto;
        } else {
            return primero + resto;
        }
    }
}
