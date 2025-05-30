package Ejercicios.Parte3_21_25;

import java.util.Scanner;

/**
 * 23. Programa con una función recursiva que cuente cuántos elementos de un arreglo
 * con X elementos enteros son mayores que un valor dado.
 *
 * @author beehr
 */
public class Act23_ContarMayores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingresa el valor base para comparar: ");
        int base = scanner.nextInt();

        int resultado = contarMayores(arreglo, 0, base);
        System.out.println("Cantidad de elementos mayores que " + base + ": " + resultado);
    }

    public static int contarMayores(int[] arr, int index, int base) {
        if (index == arr.length) {
            return 0;
        }
        int suma = arr[index] > base ? 1 : 0;
        return suma + contarMayores(arr, index + 1, base);
    }
}
