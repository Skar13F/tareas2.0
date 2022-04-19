/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Halla el valor de x1 y x2 a partir de los valores a, b y c.
 * 				Devuelve el resultado  
 */
package ejercicio9;

//import java.util.Scanner;
public class Ecuacion2 {
	private double a;
	private double b;
	private double c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	

	public double Resultado() {
		if (this.a == 0) {
			return 0;
		} else {
			return Math.sqrt((this.b * this.b) - (4 * this.a * this.c));
		}
	}

	public double Solucion(int x) {
		if (x == 0) {
			return (-this.b + Resultado()) / (2 * this.a);
		} else {
			return (-this.b - Resultado()) / (2 * this.a);
		}
	}

}
