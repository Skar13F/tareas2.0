/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 13 de abril de 2022
 * Fecha de actualización: 13 de abril de 2022
 * Descripción: solicita al usuario el día de la semana y devuelve la materia
 * 				que le toca a primera hora 
 */
package ejercicio1;

import java.util.Scanner;

public class Principal {
	static private Scanner s;
	static private Dias dia;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		dia = new Dias();
		System.out.println("ingresa el día de la semana");
		dia.setDia(s.nextLine());
		dia.Mat();
		System.out.println("La materia que te toca a primera hora es: " + dia.getMateria());
	}

}
