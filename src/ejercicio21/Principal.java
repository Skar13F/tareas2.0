/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 19 de abril de 2022
 * Descripción: Lee 2 notas de teclado e imprime la media de ellos
 */
package ejercicio21;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Promedio media;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		media = new Promedio();

		System.out.print("Nota del primer control: ");
		media.setNota1(s.nextFloat());

		System.out.print("Nota del segundo control: ");
		media.setNota2(s.nextFloat());

		System.out.print("Tu nota de Programación es " + media.Prom());
	}

}
