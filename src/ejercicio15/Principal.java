/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 18 de abril de 2022
 * Descripción: Solicita un caracter al usuario, y una característica
 * 				de impresión de la pirámide, imprime la piramide según
 * 				la selección del usuario
 */
package ejercicio15;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Piramide fig;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		fig = new Piramide();
		System.out.println("Este programa pinta una pirámide.");
		System.out.print("Introduzca un carácter de relleno: ");
		fig.setCaracter(s.nextLine());

		do {
			System.out.println("Elija un tipo de pirámide");
			System.out.println("1. Con el vértice hacia arriba");
			System.out.println("2. Con el vértice hacia abajo");
			System.out.println("3. Con el vértice hacia la izquierda");
			System.out.println("4. Con el vértice hacia la derecha");
			fig.setOpcion(s.nextInt());

		} while (fig.getOpcion() < 1 || fig.getOpcion() > 4);

		switch (fig.getOpcion()) {
		case 1:
			System.out.println("  " + fig.getCaracter());
			System.out.println(" " + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
			System.out.println(
					fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
			break;
		case 2:
			System.out.println(
					fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
			System.out.println(" " + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
			System.out.println("  " + fig.getCaracter());
			break;
		case 3:
			System.out.println("    " + fig.getCaracter());
			System.out.println("  " + fig.getCaracter() + " " + fig.getCaracter());
			System.out.println(fig.getCaracter() + " " + fig.getCaracter() + " " + fig.getCaracter());
			System.out.println("  " + fig.getCaracter() + " " + fig.getCaracter());
			System.out.println("    " + fig.getCaracter());
			break;
		case 4:
			System.out.println(fig.getCaracter());
			System.out.println(fig.getCaracter() + " " + fig.getCaracter());
			System.out.println(fig.getCaracter() + " " + fig.getCaracter() + " " + fig.getCaracter());
			System.out.println(fig.getCaracter() + " " + fig.getCaracter());
			System.out.println(fig.getCaracter());
			break;
		default:
		}
	}

}
