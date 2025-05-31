package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 4. Propón un programa recursivo que cuente la cantidad de dígitos que
 * contiene un número entero.
 *
 */
public class Act04_ContarDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        System.out.println("Cantidad de dígitos: " + contarDigitos(numero));
    }

    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }
}
