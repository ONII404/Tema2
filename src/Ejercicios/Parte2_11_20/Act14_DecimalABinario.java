package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 14. Programa con una función recursiva que convierta un número decimal a su
 * representación binaria.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act14_DecimalABinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        int numero = scanner.nextInt();
        System.out.print("Representación binaria: ");
        convertirABinario(numero);
        System.out.println();
    }

    public static void convertirABinario(int numero) {
        if (numero > 0) {
            convertirABinario(numero / 2);
            System.out.print(numero % 2);
        }
    }
}
