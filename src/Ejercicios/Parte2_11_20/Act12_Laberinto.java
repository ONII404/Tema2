package Ejercicios.Parte2_11_20;

/**
 * 12. Programa que encuentra una solución recursiva para recorrer un laberinto
 * representado por una matriz y hallar la salida.
 *
 * @author beehr
 */
public class Act12_Laberinto {

    static int[][] laberinto = {
        {0, 0, 1, 0},
        {1, 0, 1, 0},
        {0, 0, 0, 0},
        {0, 1, 1, 0}
    };

    static int n = 4;

    public static void main(String[] args) {
        if (resolver(0, 0)) {
            System.out.println("¡Hay una ruta hacia la salida!");
        } else {
            System.out.println("No hay salida posible.");
        }
    }

    public static boolean resolver(int x, int y) {
        if (x == n - 1 && y == n - 1) {
            return true;
        }
        if (esValido(x, y)) {
            laberinto[x][y] = 2; // marcar como parte de la ruta
            if (resolver(x + 1, y)) return true;
            if (resolver(x, y + 1)) return true;
            laberinto[x][y] = 0; // retroceder
        }
        return false;
    }

    public static boolean esValido(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n && laberinto[x][y] == 0;
    }
}
