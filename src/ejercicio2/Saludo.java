/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 13 de abril de 2022
 * Fecha de actualización: 13 de abril de 2022
 * Descripción: Se crea 2 variables una para la hora del día y la otra
 * 				para el mensaje de saludo correspondiente a la hora ingresada
 */
package ejercicio2;

public class Saludo {
	private String mensaje;
	private float hora;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public float getHora() {
		return hora;
	}

	public void setHora(float hora) {
		this.hora = hora;
	}

}
