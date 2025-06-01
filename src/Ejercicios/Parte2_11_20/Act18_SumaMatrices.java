package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 18. Programa recursivo para sumar dos matrices del mismo tamaño.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act18_SumaMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println("Ingresa los valores de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingresa los valores de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        int[][] suma = new int[filas][columnas];
        sumarMatrices(matriz1, matriz2, suma, 0, 0);

        System.out.println("Resultado de la suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumarMatrices(int[][] m1, int[][] m2, int[][] res, int i, int j) {
        if (i >= m1.length) {
            return;
        }
        if (j >= m1[0].length) {
            sumarMatrices(m1, m2, res, i + 1, 0);
            return;
        }
        res[i][j] = m1[i][j] + m2[i][j];
        sumarMatrices(m1, m2, res, i, j + 1);
    }
}
