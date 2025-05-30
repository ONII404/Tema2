package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 20. Programa que encuentra un método recursivo para generar todas las
 * combinaciones de X elementos enteros de un arreglo.
 *
 * @author beehr
 */
public class Act20_Combinaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Combinaciones posibles:");
        for (int r = 1; r <= n; r++) {
            generarCombinaciones(arreglo, new int[r], 0, 0, r);
        }
    }

    public static void generarCombinaciones(int[] arr, int[] temp, int start, int index, int r) {
        if (index == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= arr.length - (r - index); i++) {
            temp[index] = arr[i];
            generarCombinaciones(arr, temp, i + 1, index + 1, r);
        }
    }
}
