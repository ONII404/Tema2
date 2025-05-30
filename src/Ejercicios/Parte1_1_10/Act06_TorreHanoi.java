package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 6. Resuelve mediante un programa un problema de la torre de Hanoi para n
 * discos, especificando los movimientos necesarios.
 *
 * @author beehr
 */
public class Act06_TorreHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de discos: ");
        int n = scanner.nextInt();
        hanoi(n, 'A', 'C', 'B');
    }

    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
        } else {
            hanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            hanoi(n - 1, auxiliar, destino, origen);
        }
    }
}
