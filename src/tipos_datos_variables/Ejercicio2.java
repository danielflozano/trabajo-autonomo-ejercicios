package tipos_datos_variables;

/*
 * Escribe un programa que convierta una temperatura de grados Celsius a Fahrenheit y viceversa.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		double celsius = 25;
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit");

        fahrenheit = 77;
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " grados Fahrenheit son " + celsius + " grados Celsius");

	}

}
