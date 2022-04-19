/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Valida los valores de a y b y da una respuesta o el resultado
 * 				haciendo un cálculo condicional  
 */
package ejercicio5;

public class Ecuacion {
	private double a;
	private float b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public double Resultado() {
		if (this.b == 0) {
			return 0;
		} else {
			return -this.b / this.a;
		}
	}

}
