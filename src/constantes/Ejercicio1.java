package constantes;

/*
 * Declara una constante para el valor de π (pi) y usa esa constante para calcular el área de un círculo con radio 5.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		final double PI = 3.14159;
		int radio = 5;
		
		double area = PI * (radio * radio);
		System.out.println("El área de un circulo con radio 5 es: " + area);

	}

}
