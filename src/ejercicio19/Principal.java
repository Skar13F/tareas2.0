package ejercicio19;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Contar cont;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		cont = new Contar();

		System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
		cont.setNum(s.nextInt());

		if (cont.getNum() < 10) {
			cont.setCant(1);
		}

		else if (cont.getNum() < 100) {
			cont.setCant(2);
		}

		else if (cont.getNum() < 1000) {
			cont.setCant(3);
		}

		else if (cont.getNum() < 10000) {
			cont.setCant(4);
		}

		else if (cont.getNum() < 100000) {
			cont.setCant(5);
		}

		if (cont.getCant() == 1) {
			System.out.println("El número introducido tiene 1 dígito.");
		} else {
			System.out.println("El número introducido tiene " + cont.getCant() + " dígitos.");
		}
	}

}
