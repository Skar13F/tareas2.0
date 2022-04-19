/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 13 de abril de 2022
 * Fecha de actualización: 13 de abril de 2022
 * Descripción: Solicita un número al usuario, valida que esté en el rango requerido
 * 				e imprime el día correspondiente al número dado
 */
package ejercicio3;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static DiaSemana dias;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		dias = new DiaSemana();
		do {
			System.out.println("Ingresa un numero del 1 al 7");
			dias.setNumero(s.nextByte());
		} while (dias.getNumero() < 1 || dias.getNumero() > 7);
		if (dias.getNumero() == 1) {
			dias.setDia("Lunes");
		} else if (dias.getNumero() == 2) {
			dias.setDia("Martes");
		} else if (dias.getNumero() == 3) {
			dias.setDia("Miércoles");
		} else if (dias.getNumero() == 4) {
			dias.setDia("Jueves");
		} else if (dias.getNumero() == 5) {
			dias.setDia("Viernes");
		} else if (dias.getNumero() == 6) {
			dias.setDia("Sábado");
		} else if (dias.getNumero() == 7) {
			dias.setDia("Domingo");
		}
		System.out.println("El día al que corresponde el número ingresado es: " + dias.getDia());
	}

}
