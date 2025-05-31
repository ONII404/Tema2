package Ejercicios.Parte2_11_20;

/**
 * 15. Programa con una función recursiva que cuente el número total de nodos en
 * un árbol binario.
 *
 * Erick Humberto Rojas Teran.
 */
public class Act15_ContarNodosArbol {

    static class Nodo {

        int valor;
        Nodo izquierdo, derecho;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        Nodo raiz = new Nodo(1);
        raiz.izquierdo = new Nodo(2);
        raiz.derecho = new Nodo(3);
        raiz.izquierdo.izquierdo = new Nodo(4);
        raiz.izquierdo.derecho = new Nodo(5);

        int total = contarNodos(raiz);
        System.out.println("Número total de nodos en el árbol: " + total);
    }

    public static int contarNodos(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
    }
}
