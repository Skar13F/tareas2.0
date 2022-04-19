package ejercicio18;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Cifra primera;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		primera = new Cifra();

		System.out.print("Por favor, introduzca un número entero positivo (5 cifras como máximo): ");
		primera.setNum(s.nextInt());

		if (primera.getNum() < 10) {
			primera.setPrim(primera.getNum());
		}

		else if ((primera.getNum() >= 10) && (primera.getNum() < 100)) {
			primera.setPrim(primera.getNum()/10);
		}

		else if ((primera.getNum() >= 100) && (primera.getNum() < 1000)) {
			primera.setPrim(primera.getNum()/100);
		}

		else if ((primera.getNum() >= 1000) && (primera.getNum() < 10000)) {
			primera.setPrim(primera.getNum()/1000);
		}

		else if (primera.getNum() >= 10000) {
			primera.setPrim(primera.getNum()/10000);
		}

		System.out.println("La primera cifra del número introducido es el " + primera.getPrim() + ".");

	}
}
