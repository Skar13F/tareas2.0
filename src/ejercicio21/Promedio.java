/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 18 de abril de 2022
 * Fecha de actualización: 19 de abril de 2022
 * Descripción: Almacena el valor de las notas leidas, calcula y devuelve
 * 				la media de ellas
 */
package ejercicio21;

public class Promedio {
	private float nota1;
	private float nota2;

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float Prom() {
		return (this.nota1 + this.nota2) / 2;
	}
}
