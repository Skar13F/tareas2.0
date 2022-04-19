/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 19 de abril de 2022
 * Descripción: Lee un número del teclado y verifica si puede leerse al revés sin alterar
 * 				su valor, de ser así manda un mensaje en pantalla que indica que se cumple
 * 				la característica
 */
package ejercicio20;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Capicua cp;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		cp = new Capicua();

		// cp.setCap(false);

		System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
		cp.setNum(s.nextInt());

		// número de una cifra
		if (cp.getNum() < 10) {
			cp.setCap(true);
		}

		// número de dos cifras
		else if ((cp.getNum() >= 10) && (cp.getNum() < 100)) {
			if ((cp.getNum() / 10) == (cp.getNum() % 10)) {
				cp.setCap(true);
			}
		}

		// número de tres cifras
		else if ((cp.getNum() >= 100) && (cp.getNum() < 1000)) {
			if ((cp.getNum() / 100) == (cp.getNum() % 10)) {
				cp.setCap(true);
			}
		}

		// número de cuatro cifras
		else if ((cp.getNum() >= 1000) && (cp.getNum() < 10000)) {
			if (((cp.getNum() / 1000) == (cp.getNum() % 10))
					&& (((cp.getNum() / 100) % 10) == ((cp.getNum() / 10) % 10))) {
				cp.setCap(true);
			}
		}

		// número de cinco cifras
		else if (cp.getNum() >= 10000) {
			if (((cp.getNum() / 10000) == (cp.getNum() % 10))
					&& ((((cp.getNum() / 1000) % 10)) == ((cp.getNum() / 10) % 10))) {
				cp.setCap(true);
			}
		}

		if (cp.isCap()) {
			System.out.println("El número introducido es capicúa.");
		} else {
			System.out.println("El número introducido no es capicúa.");
		}
	}

}
