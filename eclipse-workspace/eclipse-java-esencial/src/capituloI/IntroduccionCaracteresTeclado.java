package capituloI;

import java.util.Scanner;

public class IntroduccionCaracteresTeclado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("C?mo te llamas?");
		
		//escanea lo que introduzca el usu?rio
		//espera que el usu?rio introduzca una cadena de caracteres
		//al pulsar la tecla Enter, escanear? la l?nea introducida y le asignar? a la variable nombre que es tipo String
		String nombre = scanner.nextLine();//String es una cadena de caracteres que es un objeto
		
		System.out.println("\n Hola, " + nombre +". Qu? tal? Bienvenido a la classe de Java!");
		
		System.out.println("\n Introduce tu edad?");
		int edad= scanner.nextInt();//el m?todo nextint indica que ser? introducido un n?mero entero.
		
		System.out.println("\n Tienes "+edad+ " a?os.");
	}
	
}
