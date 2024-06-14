package estructuras_datos_arreglos;

/*
 * Escribe un programa que encuentre el valor máximo en un array de enteros.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		int[] numeros = {3, 5, 7, 2, 8, 1, 4, 10, 6};

        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El valor máximo es: " + maximo);

	}

}
