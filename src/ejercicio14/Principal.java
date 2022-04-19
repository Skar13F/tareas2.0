/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 18 de abril de 2022
 * Descripción: Solicita un número al usuario, y valida si es par o no, además
 * 				si este es divisible entre 5
 */
package ejercicio14;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Valida val;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		val = new Valida();
		System.out.print("Por favor, introduzca un número entero: ");
		val.setNum(s.nextInt());

		if ((val.getNum() % 2) == 0) {
			System.out.print("El número introducido es par");
		} else {
			System.out.print("El número introducido es impar");
		}

		if ((val.getNum() % 5) == 0) {
			System.out.println(" y divisible entre 5.");
		} else {
			System.out.println(" y no es divisible entre 5.");
		}
	}

}
