package Ejercicios.Parte2_11_20;

import java.util.Scanner;

/**
 * 19. Programa con método recursivo que genere la secuencia de Collatz para un
 * número inicial dado.
 *
 * @author beehr
 */
public class Act19_SecuenciaCollatz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();
        System.out.println("Secuencia de Collatz:");
        collatz(n);
    }

    public static void collatz(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            collatz(n / 2);
        } else {
            collatz(3 * n + 1);
        }
    }
}
