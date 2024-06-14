package ejercicio_suma_arreglos;

/*
 * Crea un programa que sume los elementos de dos arreglos y almacene el resultado en un tercer arreglo.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {6, 7, 8, 9, 10};
        int[] suma = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            suma[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.print("Resultado de la suma de arreglos: ");
        for (int i = 0; i < suma.length; i++) {
            System.out.print(suma[i] + "|");
        }

	}

}
