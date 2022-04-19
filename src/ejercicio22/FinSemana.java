/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 19 de abril de 2022
 * Descripción: Almacena el día leido del teclado, el número que se le asigna,
 * 				la hora y minutos que el usuario ingresa. Calcula los minutos
 * 				faltantes para que la semana termine y los devuelve.
 */
package ejercicio22;

public class FinSemana {
	private String dia;
	private int diaNumerico;
	private int hora;
	private int minutos;

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getDiaNumerico() {
		return diaNumerico;
	}

	public void setDiaNumerico(int diaNumerico) {
		this.diaNumerico = diaNumerico;
	}

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

	public int Subtotal() {
		return (4 * 24 * 60) + (15 * 60);
	}

	public int Total() {
		return (diaNumerico * 24 * 60) + (hora * 60) + minutos;
	}
}
