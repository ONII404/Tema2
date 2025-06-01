package Ejercicios.Parte3_21_25;

import java.util.Scanner;

/**
 * 21. Programa con una función recursiva que determine si un número entero es
 * primo.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act21_NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero, 2)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return esPrimo(n, divisor + 1);
    }
}
