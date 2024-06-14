package ejercicio_suma_arreglos;

/*
 * Crea un programa que calcule la suma de los elementos en las posiciones pares de un array.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                suma += numeros[i];
            }
        }

        System.out.println("La suma de los elementos en posiciones pares es: " + suma);
        
	}

}
