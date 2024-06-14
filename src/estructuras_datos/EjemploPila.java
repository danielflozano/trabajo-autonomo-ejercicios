package estructuras_datos;

import java.util.Stack;

/*
 * Implementa una pila utilizando una clase y realiza operaciones básicas como apilar (push)
 * desapilar (pop) y verificar si la pila está vacía.
 */

public class EjemploPila {
	
	 public static void main(String[] args) {
	        Stack<Integer> pila = new Stack<>();

	        // Apilar elementos
	        pila.push(10);
	        pila.push(20);
	        pila.push(30);

	        // Imprimir la pila
	        System.out.println("Pila: " + pila);

	        // Desapilar elementos
	        int elemento = pila.pop();
	        System.out.println("Elemento desapilado: " + elemento);

	        // Verificar si la pila está vacía
	        boolean estaVacia = pila.isEmpty();
	        System.out.println("¿La pila está vacía? " + estaVacia);
	    }

}
