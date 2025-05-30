package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 3. Diseña una función recursiva que permita invertir una cadena de
 * caracteres.
 *
 * @author beehr
 */
public class Act03_InvertirCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        System.out.println("Cadena invertida: " + invertir(cadena));
    }

    public static String invertir(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return invertir(s.substring(1)) + s.charAt(0);
    }
}
