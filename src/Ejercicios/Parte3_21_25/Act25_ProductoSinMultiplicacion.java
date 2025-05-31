package Ejercicios.Parte3_21_25;

import java.util.Scanner;

/**
 * 25. Programa con una función recursiva que calcule el producto de dos números
 * enteros sin utilizar el operador de multiplicación.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act25_ProductoSinMultiplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt();

        int resultado = multiplicar(a, b);
        System.out.println("El producto es: " + resultado);
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiplicar(a, b - 1);
        }
        return -multiplicar(a, -b);
    }
}
