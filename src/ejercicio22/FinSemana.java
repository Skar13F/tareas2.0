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
