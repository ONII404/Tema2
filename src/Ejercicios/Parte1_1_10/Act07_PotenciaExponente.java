package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 7. Realiza un programa con una función recursiva para calcular la potencia de
 * un número entero (base^exponente)."
 *
 * Erick Humberto Rojas Teran.
 */
public class Act07_PotenciaExponente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();
        System.out.println("Resultado: " + potencia(base, exponente));
    }

    public static int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * potencia(base, exp - 1);
    }
}
