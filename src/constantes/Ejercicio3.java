package constantes;

/*
 * Crea un programa que declare una constante para la velocidad de la luz (299792458 m/s)
 * y calcule cuánto tiempo tarda la luz en recorrer 1 millón de kilómetros.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		final int VELOCIDAD_LUZ = 299792458; // en metros por segundo
        int distancia = 1000000 * 1000; // 1 millón de kilómetros en metros
        double tiempo = (double) distancia / VELOCIDAD_LUZ;

        System.out.println("La luz tarda " + tiempo + " segundos en recorrer 1 millón de kilómetros.");

	}

}
