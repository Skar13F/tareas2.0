package ejercicio14;
import java.util.Scanner;
public class Principal {
	private static Scanner s;
	private static Valida val;
	public static void main(String[] args) {
        s=new Scanner(System.in);
        val=new Valida();
	    System.out.print("Por favor, introduzca un número entero: ");
	    val.setNum(s.nextInt());
	    //int n = Integer.parseInt(System.console().readLine());

	    if ((val.getNum() % 2) == 0) {
	      System.out.print("El número introducido es par");
	    } else {
	      System.out.print("El número introducido es impar");
	    }

	    if ((val.getNum() % 5) == 0) {
	      System.out.println(" y divisible entre 5.");
	    } else {
	      System.out.println(" y no es divisible entre 5.");
	    }
	  }

}
