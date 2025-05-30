package Ejercicios.Parte1_1_10;

import java.util.Scanner;

/**
 * 10. Establece un programa recursivo que calcule la suma de los primeros n
 * números naturales.
 *
 * @author beehr
 */
public class Act10_SumaNumerosNaturales {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa un número n: "); 
        int n = scanner.nextInt(); 
        System.out.println("Suma de los primeros " + n + " números naturales es: " + suma(n)); 
    } 

    public static int suma(int n) { 
        if (n == 0) {
            return 0; 
        }
        return n + suma(n - 1); 
    } 
} 
