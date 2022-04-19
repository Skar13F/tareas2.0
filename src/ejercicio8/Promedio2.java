/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 16 de abril de 2022
 * Fecha de actualización: 16 de abril de 2022
 * Descripción: Calcula la media de 3 notas e imprime un mensaje de acuerdo
 * 				a la media obtenida  
 */
package ejercicio8;

public class Promedio2 {
	private float nota1;
	private float nota2;
	private float nota3;
	private float prom;

	public float getProm() {
		return prom;
	}

	public void setProm(float prom) {
		this.prom = prom;
	}

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

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float Media() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}

	public void Nota() {// insuficiente, suficiente, bien, notable, sobresaliente
		if (this.prom < 6) {
			System.out.print(" Promedio insuficiente");
		} else if (this.prom <= 7) {
			System.out.print(" Promedio suficiente");
		} else if (this.prom <= 8) {
			System.out.print(" Promedio bueno");
		} else if (this.prom <= 9) {
			System.out.print(" Promedio notable");
		} else if (this.prom <= 10) {
			System.out.print(" Promedio sobresaliente");
		}
	}

}
