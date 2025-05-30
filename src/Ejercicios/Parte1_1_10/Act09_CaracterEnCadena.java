package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 9. Propón una función recursiva que cuente cuántas veces aparece un carácter
 * determinado en una cadena.
 *
 * @author beehr
 */
public class Act09_CaracterEnCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Carácter a contar: ");
        char caracter = scanner.next().charAt(0);
        System.out.println("Cantidad de veces que aparece '" + caracter + "': " + contarChar(cadena, caracter, 0));
    }

    public static int contarChar(String cadena, char caracter, int i) {
        if (i >= cadena.length()) {
            return 0;
        }
        return (cadena.charAt(i) == caracter ? 1 : 0) + contarChar(cadena, caracter, i + 1);
    }
}
