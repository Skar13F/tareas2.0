/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Solicita la altura en metros al usuario e imprime el resultado de tiempo  
 */
package ejercicio6;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static CalculaTiempo calc;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		calc = new CalculaTiempo();
		System.out.println("Ingresa la altura en metros");
		calc.setMetros(s.nextFloat());
		System.out.println("el tiempo que tardará en caer el objeto es de: " + calc.Resultado() + " Segundos");

	}

}
