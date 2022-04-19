/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Solicita al usuario ingrese el número de horas trabajadas durante la semana
 * 				e imprime el salario que le corresponde  
 */
package ejercicio4;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Salario sal;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		sal = new Salario();
		System.out.print("¿Cuántas horas trabajaste esta semana?: ");
		sal.setHoras(s.nextFloat());
		System.out.println("El salario correspondiente es de: $ " + sal.Total());

	}

}
