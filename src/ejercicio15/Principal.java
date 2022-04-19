package ejercicio15;
import java.util.Scanner;
public class Principal {
	private static Scanner s;
	private static Piramide fig;
	public static void main(String[] args) {
        s=new Scanner(System.in);
        fig=new Piramide();
	    System.out.println("Este programa pinta una pirámide.");
	    System.out.print("Introduzca un carácter de relleno: ");
	    fig.setCaracter(s.nextLine());
	    //String r = System.console().readLine();
	    do {
	    	System.out.println("Elija un tipo de pirámide");
		    System.out.println("1. Con el vértice hacia arriba");
		    System.out.println("2. Con el vértice hacia abajo");
		    System.out.println("3. Con el vértice hacia la izquierda");
		    System.out.println("4. Con el vértice hacia la derecha");
		    fig.setOpcion(s.nextInt());
		    //int opcion = Integer.parseInt(System.console().readLine());
	    }while(fig.getOpcion()<1 || fig.getOpcion()>4);
	    
	    switch(fig.getOpcion()) {
	      case 1:
	        System.out.println("  " + fig.getCaracter());
	        System.out.println(" " + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
	        System.out.println(fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
	        break;
	      case 2:
	        System.out.println(fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
	        System.out.println(" " + fig.getCaracter() + fig.getCaracter() + fig.getCaracter());
	        System.out.println("  " + fig.getCaracter());
	        break;
	      case 3:
	        System.out.println("    " + fig.getCaracter());
	        System.out.println("  " + fig.getCaracter() + " " + fig.getCaracter());
	        System.out.println(fig.getCaracter() + " " + fig.getCaracter() + " " + fig.getCaracter());
	        System.out.println("  " + fig.getCaracter() + " " + fig.getCaracter());
	        System.out.println("    " + fig.getCaracter());
	        break;
	      case 4:
	        System.out.println(fig.getCaracter());
	        System.out.println(fig.getCaracter() + " " + fig.getCaracter());
	        System.out.println(fig.getCaracter() + " " + fig.getCaracter() + " " + fig.getCaracter());
	        System.out.println(fig.getCaracter() + " " + fig.getCaracter());
	        System.out.println(fig.getCaracter());
	        break;
	      default:
	    }
	  }

}
