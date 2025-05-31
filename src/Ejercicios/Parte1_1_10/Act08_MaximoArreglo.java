package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 8. Diseña una solución recursiva que encuentre el valor máximo dentro de un
 * arreglo de tamaño X.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act08_MaximoArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos elementos tendrá el arreglo?: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Bucle pra llenar Array
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Máximo valor: " + maximo(array, n - 1));
    }

    public static int maximo(int[] array, int n) {
        if (n == 0) {
            return array[0];
        }
        return Math.max(array[n], maximo(array, n - 1));
    }
}
