/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Calcula los segundos faltantes para la media noche  
 */
package ejercicio11;

public class Horas {
	private int hora;
	private int minutos;

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int Operacion() {
		if (this.minutos == 0) {
			return (24 - this.hora) * 3600;
		} else {
			int a = (24 - this.hora - 1) * 60 + (60 - this.minutos);
			return a * 60;
		}
	}
}
