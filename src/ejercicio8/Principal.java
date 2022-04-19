/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Solicita 3 notas al usuario y calcula la media de ellas
 * 				además imprime un mensaje dependiendo del rango
 * 				en que se ubica la media  
 */
package ejercicio8;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Promedio2 prom;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		prom = new Promedio2();
		System.out.print("Ingresa la primera nota: ");
		prom.setNota1(s.nextFloat());
		System.out.print("Ingresa la segunda nota: ");
		prom.setNota2(s.nextFloat());
		System.out.print("Ingresa la tercera nota: ");
		prom.setNota3(s.nextFloat());
		System.out.println("\nTu promedio es: " + prom.Media());
		prom.setProm(prom.Media());
		prom.Nota();
	}

}
