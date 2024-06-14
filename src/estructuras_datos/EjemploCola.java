package estructuras_datos;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Implementa una cola utilizando una clase y realiza operaciones básicas como encolar (enqueue)
 * desencolar (dequeue) y verificar si la cola está vacía.
 */

public class EjemploCola {
	
	public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Encolar elementos
        cola.add(10);
        cola.add(20);
        cola.add(30);

        // Imprimir la cola
        System.out.println("Cola: " + cola);

        // Desencolar elementos
        int elemento = cola.poll();
        System.out.println("Elemento desencolado: " + elemento);

        // Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿La cola está vacía? " + estaVacia);
    }

}
