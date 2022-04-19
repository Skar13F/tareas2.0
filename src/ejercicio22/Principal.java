/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 19 de abril de 2022
 * Descripción: Solicita un día de la semana al usuario, además de
 * 				la hora (hora y minutos) e imprime la cantidad de minutos faltantes
 * 				para que termine la semana
 */
package ejercicio22;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static FinSemana fin;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		fin = new FinSemana();
		System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
		fin.setDia(s.nextLine());

		fin.setDiaNumerico(0);

		switch (fin.getDia()) {
		case "lunes":
			fin.setDiaNumerico(0);
			break;
		case "martes":
			fin.setDiaNumerico(1);
			break;
		case "miércoles":
		case "miercoles":
			fin.setDiaNumerico(2);
			break;
		case "jueves":
			fin.setDiaNumerico(3);
			break;
		case "viernes":
			fin.setDiaNumerico(4);
			break;
		default:
			System.out.print("El día introducido no es correcto.");
		}

		System.out.println("A continuación introduzca la hora (hora y minutos)");

		System.out.print("Hora: ");
		fin.setHora(s.nextInt());

		System.out.print("Minutos: ");
		fin.setMinutos(s.nextInt());

		System.out.print("Faltan " + (fin.Subtotal() - fin.Total()) + " minutos para llegar al fin de semana.");
	}

}
