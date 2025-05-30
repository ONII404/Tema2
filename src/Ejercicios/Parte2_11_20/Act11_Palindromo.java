package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 11. Programa que determina si una palabra es un palíndromo utilizando recursividad.
 *
 * @author beehr
 */
public class Act11_Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        if (esPalindromo(palabra, 0, palabra.length() - 1)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return esPalindromo(palabra, inicio + 1, fin - 1);
    }
}
