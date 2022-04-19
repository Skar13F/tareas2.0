/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Calcula el salario a pagar respecto a las horas trabajadas
 * 				con opción de un salario extra  
 */
package ejercicio4;

public class Salario {
	private float horas;

	public float getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}

	public float Total() {
		if (getHoras() <= 40) {
			return 12 * getHoras();
		} else {
			return (40 * 12) + ((getHoras() - 40) * 16);
		}
	}
}
