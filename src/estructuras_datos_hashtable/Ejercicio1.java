package estructuras_datos_hashtable;

import java.util.Hashtable;

/*
 * Escribe un programa que almacene y recupere pares clave-valor en un Hashtable.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("uno", 1);
        hashtable.put("dos", 2);
        hashtable.put("tres", 3);

        System.out.println("Valor asociado con 'uno': " + hashtable.get("uno"));
        System.out.println("Valor asociado con 'dos': " + hashtable.get("dos"));
        System.out.println("Valor asociado con 'tres': " + hashtable.get("tres"));

	}

}
