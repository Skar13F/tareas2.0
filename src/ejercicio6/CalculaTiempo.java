/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Calcula el tiempo de caida de un objeto  
 */
package ejercicio6;

public class CalculaTiempo {
	private double metros;

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public double Resultado() {
		return Math.sqrt((2 * this.metros) / 9.81);
	}
}
