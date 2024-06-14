package estructuras_datos_hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Escribe un programa que imprima todas las claves y valores de un Hashtable.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("uno", 1);
        hashtable.put("dos", 2);
        hashtable.put("tres", 3);

        Enumeration<String> claves = hashtable.keys();
        while (claves.hasMoreElements()) {
            String clave = claves.nextElement();
            System.out.println(clave + ": " + hashtable.get(clave));
        }

	}

}
