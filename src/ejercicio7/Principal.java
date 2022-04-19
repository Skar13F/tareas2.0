/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Solicita 3 notas al usuario e imprime la media de ellas  
 */
package ejercicio7;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Promedio prom;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		prom = new Promedio();
		System.out.print("Ingresa la primera nota: ");
		prom.setNota1(s.nextFloat());
		System.out.print("Ingresa la segunda nota: ");
		prom.setNota2(s.nextFloat());
		System.out.print("Ingresa la tercera nota: ");
		prom.setNota3(s.nextFloat());
		System.out.println("Tu promedio es: " + prom.Media());
	}

}
