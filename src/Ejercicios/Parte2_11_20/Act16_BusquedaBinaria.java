package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 16. Programa que implementa una búsqueda binaria recursiva dentro de un
 * arreglo con X elementos enteros ordenado.
 *
 * @author beehr
 */
public class Act16_BusquedaBinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de elementos del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingresa " + n + " elementos ordenados:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingresa el número a buscar: ");
        int objetivo = scanner.nextInt();

        int resultado = busquedaBinaria(arreglo, 0, n - 1, objetivo);

        if (resultado != -1) {
            System.out.println("El número se encuentra en la posición: " + resultado);
        } else {
            System.out.println("El número no está en el arreglo.");
        }
    }

    public static int busquedaBinaria(int[] arr, int inicio, int fin, int objetivo) {
        if (inicio > fin) {
            return -1;
        }
        int medio = (inicio + fin) / 2;
        if (arr[medio] == objetivo) {
            return medio;
        } else if (arr[medio] > objetivo) {
            return busquedaBinaria(arr, inicio, medio - 1, objetivo);
        } else {
            return busquedaBinaria(arr, medio + 1, fin, objetivo);
        }
    }
}
