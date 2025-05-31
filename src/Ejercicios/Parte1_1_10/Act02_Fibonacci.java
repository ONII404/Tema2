package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 2. Encuentra una solución recursiva para obtener el n-ésimo número de la
 * serie de Fibonacci.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act02_Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la posición n de Fibonacci: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci en la posición " + n + " es: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
