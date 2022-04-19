/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Solicita el número de mes y día al usuario, imprime el horóscopo
 * 				que le corresponde a la fecha  
 */
package ejercicio10;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Horoscopo uno;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		uno = new Horoscopo();

		do {
			System.out.println("Inresa el número de mes correspondiente");
			uno.setMes(s.nextByte());
		} while (uno.getMes() < 0 || uno.getMes() > 12);
		if (uno.getMes() == 1 || uno.getMes() == 3 || uno.getMes() == 5 || uno.getMes() == 7 || uno.getMes() == 8
				|| uno.getMes() == 10 || uno.getMes() == 12) {
			do {
				System.out.println("Inresa el número del día correspondiente entre 1 y 31");
				uno.setDia(s.nextByte());
			} while (uno.getDia() < 0 || uno.getDia() > 31);
		} else {
			do {
				System.out.println("Inresa el número del día correspondiente entre 1 y 30");
				uno.setDia(s.nextByte());
			} while (uno.getDia() < 0 || uno.getDia() > 30);
		}

		switch (uno.getMes()) {
		case 1:
			if (uno.getDia() <= 18) {
				System.out.println("Sagitario");
			} else {
				System.out.println("Capricornio");
			}
			break;
		case 2:
			if (uno.getDia() <= 15) {
				System.out.println("Capricornio");
			} else {
				System.out.println("Acuario");
			}
			break;
		case 3:
			if (uno.getDia() <= 11) {
				System.out.println("Acuario");
			} else {
				System.out.println("Picis");
			}
			break;
		case 4:
			if (uno.getDia() <= 18) {
				System.out.println("Picis");
			} else {
				System.out.println("Aries");
			}
			break;
		case 5:
			if (uno.getDia() <= 13) {
				System.out.println("Aries");
			} else {
				System.out.println("Tauro");
			}
			break;
		case 6:
			if (uno.getDia() <= 19) {
				System.out.println("Tauro");
			} else {
				System.out.println("Géminis");
			}
			break;
		case 7:
			if (uno.getDia() <= 20) {
				System.out.println("Géminis");
			} else {
				System.out.println("Cáncer");
			}
			break;
		case 8:
			if (uno.getDia() <= 9) {
				System.out.println("Cáncer");
			} else {
				System.out.println("Leo");
			}
			break;
		case 9:
			if (uno.getDia() <= 15) {
				System.out.println("Leo");
			} else {
				System.out.println("Virgo");
			}
			break;
		case 10:
			if (uno.getDia() <= 30) {
				System.out.println("Virgo");
			} else {
				System.out.println("Libra");
			}
			break;
		case 11:
			if (uno.getDia() <= 22) {
				System.out.println("Libra");
			} else {
				System.out.println("Escorpio");
			}
			break;
		case 12:
			if (uno.getDia() <= 29) {
				System.out.println("Escorpio");
			} else {
				System.out.println("Sagitario");
			}
			break;
		}
	}

}
