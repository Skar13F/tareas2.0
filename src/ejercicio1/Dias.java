/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 13 de abril de 2022
 * Fecha de actualización: 13 de abril de 2022
 * Descripción: Compara el día de la semana ingresada por el usuario
 * 				y en base a ello asigna una materia  
 */
package ejercicio1;

public class Dias {
	private String dia;
	private String materia;

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void Mat() {
		if (this.dia.equalsIgnoreCase("Lunes")) {
			setMateria("Métodos Numéricos");
		} else if (this.dia.equalsIgnoreCase("Martes")) {
			setMateria("Diseño Web");
		} else if (this.dia.equalsIgnoreCase("Miércoles")) {
			setMateria("Paradigmas 1");
		} else if (this.dia.equalsIgnoreCase("Jueves")) {
			setMateria("Programación de Sistemas");
		} else if (this.dia.equalsIgnoreCase("Viernes")) {
			setMateria("Base de Datos");
		}
	}

}
