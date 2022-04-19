/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Lee de teclado la hora (hora y minutos del día).
 * 				Imprime los segundos faltantes para la media noche  
 */
package ejercicio11;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Horas seg;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		seg = new Horas();
		do {
			System.out.print("Ingresa la hora (en formato de 24 horas)");
			seg.setHora(s.nextInt());
		} while (seg.getHora() < 0 || seg.getHora() > 23);
		do {
			System.out.print("Ingresa los minutos ");
			seg.setMinutos(s.nextInt());
		} while (seg.getMinutos() < 0 || seg.getMinutos() > 60);
		System.out.println("\nfaltan " + seg.Operacion() + " segunos para que termine el día");
	}

}
