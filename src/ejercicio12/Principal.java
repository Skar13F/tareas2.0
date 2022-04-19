/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 18 de abril de 2022
 * Descripción: Realiza un cuestionario al usuario, y suma los puntos obtenidos
 * 				imprime el resultado obtenido  
 */
package ejercicio12;

import java.util.Scanner;

public class Principal {
	private static Scanner s;
	private static Cuestionario cuest;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		cuest = new Cuestionario();

		System.out.println("CUESTIONARIO DE 1º DAM");
		cuest.setPuntos(0);
		System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
		System.out.println("a) int\nb) double\nc) float");
		System.out.print("=> ");
		cuest.setRespuesta(s.nextLine());
		if (cuest.getRespuesta().equals("b")) {
			cuest.setPuntos(cuest.getPuntos() + 1);
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
		System.out.println("a) XML\nb) SELECT\nc) SQL");
		System.out.print("=> ");
		cuest.setRespuesta(s.nextLine());
		if (cuest.getRespuesta().equals("c")) {
			cuest.setPuntos(cuest.getPuntos() + 1);
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
		System.out.println("a) href\nb) a\nc) link");
		System.out.print("=> ");
		cuest.setRespuesta(s.nextLine());
		if (cuest.getRespuesta().equals("b")) {
			cuest.setPuntos(cuest.getPuntos() + 1);
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
		System.out.println("a) /etc\nb) /config\nc) /cfg");
		System.out.print("=> ");
		cuest.setRespuesta(s.nextLine());
		if (cuest.getRespuesta().equals("a")) {
			cuest.setPuntos(cuest.getPuntos() + 1);
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
		System.out.println("a) RAM\nb) EPROM\nc) ROM");
		System.out.print("=> ");
		cuest.setRespuesta(s.nextLine());
		if (cuest.getRespuesta().equals("a")) {
			cuest.setPuntos(cuest.getPuntos() + 1);
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		System.out.println("\nHa obtenido " + cuest.getPuntos() + " puntos.");
	}

}
