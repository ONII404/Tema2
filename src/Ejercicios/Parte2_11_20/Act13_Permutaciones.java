package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 13. Programa con un método recursivo para generar todas las permutaciones
 * posibles de una cadena.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act13_Permutaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        generarPermutaciones("", cadena, 0);
    }

    // Función única recursiva (sin bucles, sin métodos auxiliares)
    public static void generarPermutaciones(String prefijo, String cadena, int indice) {
        if (cadena.isEmpty()) {
            System.out.println(prefijo);
        } else if (indice < cadena.length()) {
            String nuevoPrefijo = prefijo + cadena.charAt(indice);
            String nuevaCadena = cadena.substring(0, indice) + cadena.substring(indice + 1);
            generarPermutaciones(nuevoPrefijo, nuevaCadena, 0);
            generarPermutaciones(prefijo, cadena, indice + 1);
        }
    }
}
