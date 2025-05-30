package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 13. Programa con un método recursivo para generar todas las permutaciones posibles de una cadena.
 * 
 * @author beehr
 */
public class Act13_Permutaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        generarPermutaciones("", cadena);
    }

    public static void generarPermutaciones(String prefijo, String cadena) {
        if (cadena.isEmpty()) {
            System.out.println(prefijo);
        } else {
            for (int i = 0; i < cadena.length(); i++) {
                generarPermutaciones(prefijo + cadena.charAt(i),
                        cadena.substring(0, i) + cadena.substring(i + 1));
            }
        }
    }
}
