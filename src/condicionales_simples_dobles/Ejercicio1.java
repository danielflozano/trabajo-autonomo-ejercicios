package condicionales_simples_dobles;

/*
 * Escribe un programa que determine si un número es positivo, negativo o cero.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero = -5;

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

	}

}
