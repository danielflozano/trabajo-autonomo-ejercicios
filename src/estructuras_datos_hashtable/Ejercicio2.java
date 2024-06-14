package estructuras_datos_hashtable;

import java.util.Hashtable;

/*
 * Crea un programa que elimine un par clave-valor de un Hashtable.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("uno", 1);
        hashtable.put("dos", 2);
        hashtable.put("tres", 3);

        hashtable.remove("dos");

        System.out.println("Valor asociado con 'dos': " + hashtable.get("dos")); // Imprime: null

	}

}
