package estructuras_iterativas_for;

/*
 * Escribe un programa que imprima la tabla de multiplicar del 5 usando un bucle for.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
	}

}
