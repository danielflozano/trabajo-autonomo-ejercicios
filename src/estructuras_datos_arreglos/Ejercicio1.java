package estructuras_datos_arreglos;

/*
 * Escribe un programa que almacene los primeros 10 números enteros en un array e imprima cada uno de ellos.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

	}

}
