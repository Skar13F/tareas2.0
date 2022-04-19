/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Solicita el valor de a y b de una ecuación lineal al usuario
 * 				para hallar el valor de la incógnita. Imprime el resultado en pantalla  
 */
package ejercicio5;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Ecuacion ecu;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		ecu = new Ecuacion();
		System.out.print("Ingresa el valor de a: ");
		ecu.setA(s.nextDouble());
		System.out.print("Ingresa el valor de b: ");
		ecu.setB(s.nextFloat());
		if (ecu.Resultado() == 0) {
			System.out.println("No hay solución válida");
		} else {
			System.out.println("El valor de x es: x = " + ecu.Resultado());
		}

	}

}
