/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 13 de abril de 2022
 * Fecha de actualización: 13 de abril de 2022
 * Descripción: Compara la hora que el usuario ingresa y guarda un mensaje
 * 				de saludo en base a ello, además imprime el mensaje al final
 */
package ejercicio2;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Saludo hola;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		hola = new Saludo();
		System.out.print("Ingresa la hora que es (en formato de 24 horas): ");
		hola.setHora(s.nextFloat());
		if (hola.getHora() >= 6 && hola.getHora() <= 12) {
			hola.setMensaje("Buenos días");
		} else if (hola.getHora() >= 13 && hola.getHora() <= 20) {
			hola.setMensaje("Buenas tardes");
		} else if ((hola.getHora() >= 21 && hola.getHora() <= 24) || (hola.getHora() >= 1 && hola.getHora() <= 5)) {
			hola.setMensaje("Buenas noches");
		}
		System.out.println("\n " + hola.getMensaje());

	}

}
