package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 1. Determina un método para calcular el factorial de un número entero
 * positivo utilizando recursividad.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act01_FactorialNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
