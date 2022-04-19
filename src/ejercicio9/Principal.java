/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Solicita el valor de a, b y c de una ecuación cuadrática al usuario
 * 				para hallar el valor 1 y 2 de la incógnita.
 * 				Imprime los resultados en pantalla  
 */
package ejercicio9;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Ecuacion2 ecu;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		ecu = new Ecuacion2();
		System.out.print("Ingresa el valor de a: ");
		ecu.setA(s.nextDouble());
		System.out.print("Ingresa el valor de b: ");
		ecu.setB(s.nextDouble());
		System.out.print("Ingresa el valor de c: ");
		ecu.setC(s.nextDouble());
		if (ecu.getA() == 0) {
			System.out.println("No hay solución válida");
		} else {
			System.out.println("El valor de x1 es: x1 = " + ecu.Solucion(0));
			System.out.println("El valor de x2 es: x2 = " + ecu.Solucion(1));
		}

	}

}
