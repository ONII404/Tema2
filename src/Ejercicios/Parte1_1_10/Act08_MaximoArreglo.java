package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 8. Diseña una solución recursiva que encuentre el valor máximo dentro de un
 * arreglo de tamaño X.
 *
 * @author beehr
 */
public class Act08_MaximoArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos elementos tendrá el arreglo?: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Máximo valor: " + maximo(arr, n - 1));
    }

    public static int maximo(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        return Math.max(arr[n], maximo(arr, n - 1));
    }
}
