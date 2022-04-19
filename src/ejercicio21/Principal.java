package ejercicio21;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Promedio media;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		media = new Promedio();

		System.out.print("Nota del primer control: ");
		media.setNota1(s.nextFloat());

		System.out.print("Nota del segundo control: ");
		media.setNota2(s.nextFloat());

		System.out.print("Tu nota de Programación es " + media.Prom());
	}

}
