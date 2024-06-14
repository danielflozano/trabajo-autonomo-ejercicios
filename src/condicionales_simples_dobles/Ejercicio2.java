package condicionales_simples_dobles;

/*
 * Crea un programa que determine si un año es bisiesto. Un año es bisiesto si es divisible por 4,
 * pero no por 100, excepto si es divisible por 400.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int anio = 2024;

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
	}

}
