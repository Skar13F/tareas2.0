/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 19 de abril de 2022
 * Descripción: Lee un numero de teclado y devuelve la última cifra del número leido
 */
package ejercicio17;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Cifra ultima;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		ultima = new Cifra();
		System.out.print("Por favor, introduzca un número entero: ");
		ultima.setNum(s.nextInt());
		// int n = Integer.parseInt(System.console().readLine());
		System.out.println("La última cifra del número introducido es el " + (ultima.getNum() % 10));
	}

}
