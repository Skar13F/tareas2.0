package ejercicio17;
import java.util.Scanner;
public class Principal {
	private static Scanner s;
	private static Cifra ultima;
	public static void main(String[] args) {
	    s=new Scanner(System.in);
	    ultima=new Cifra();
	    System.out.print("Por favor, introduzca un número entero: ");
	    ultima.setNum(s.nextInt());
	    //int n = Integer.parseInt(System.console().readLine());
	    System.out.println("La última cifra del número introducido es el " + (ultima.getNum() % 10));
	  }

}
