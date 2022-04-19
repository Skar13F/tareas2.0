/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 18 de abril de 2022
 * Descripción: Lee tres números de teclado y los ordena de menor a mayor.
 * 				Imprime los datos
 */
package ejercicio13;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Orden ord;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		ord = new Orden();
		int aux;
		System.out.println("Este programa ordena tres números introducidos por teclado.");
		System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
		ord.setA(s.nextInt());
		ord.setB(s.nextInt());
		ord.setC(s.nextInt());

// ordenación de los dos primeros números
		if (ord.getA() > ord.getB()) {
			aux = ord.getA();
			ord.setA(ord.getB());
			ord.setB(aux);
		}
// ordenación de los dos últimos números
		if (ord.getB() > ord.getC()) {
			aux = ord.getB();
			ord.setB(ord.getC());
			ord.setC(aux);
		}
// se vuelven a ordenar los dos primeros
		if (ord.getA() > ord.getB()) {
			aux = ord.getA();
			ord.setA(ord.getB());
			ord.setB(aux);
		}

		System.out.println("Los números introducidos ordenados de menor a mayor son " + ord.getA() + ", " + ord.getB()
				+ " y " + ord.getC() + ".");
	}

}
