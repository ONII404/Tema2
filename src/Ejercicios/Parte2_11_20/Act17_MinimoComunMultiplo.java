package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 17. Programa con una función recursiva que calcule el mínimo común múltiplo
 * de dos números enteros.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act17_MinimoComunMultiplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();

        int mcm = (a * b) / mcd(a, b);
        System.out.println("El MCM de " + a + " y " + b + " es: " + mcm);
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
}
