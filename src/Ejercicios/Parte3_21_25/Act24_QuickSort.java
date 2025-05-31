package Ejercicios.Parte3_21_25;

import java.util.Scanner;

/**
 * 24. Programa que ordena un arreglo de X enteros utilizando el algoritmo Quicksort
 * de forma recursiva.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act24_QuickSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int pivoteIndex = particionar(arr, izquierda, derecha);
            quickSort(arr, izquierda, pivoteIndex - 1);
            quickSort(arr, pivoteIndex + 1, derecha);
        }
    }

    public static int particionar(int[] arr, int izquierda, int derecha) {
        int pivote = arr[derecha];
        int i = izquierda - 1;
        for (int j = izquierda; j < derecha; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[derecha];
        arr[derecha] = temp;
        return i + 1;
    }
}
