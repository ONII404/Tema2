package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 5. Desarrolla un programa con un método recursivo que calcule la suma de
 * todos los elementos de un arreglo de X elementos enteros.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act05_SumaNumsArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos elementos tendrá el arreglo?: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.println("Suma de los elementos: " + sumaArreglo(arreglo, n - 1));
    }

    public static int sumaArreglo(int[] arr, int i) {
        if (i < 0) {
            return 0;
        }
        return arr[i] + sumaArreglo(arr, i - 1);
    }
}
