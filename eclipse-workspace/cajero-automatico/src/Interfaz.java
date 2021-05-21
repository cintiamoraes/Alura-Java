
import java.util.Scanner;

public class Interfaz {
	
		public static void main(String[] args) {
		System.out.println("Elija una de las seguientes opciones:");
		System.out.println("Escriba 1 para consultar su saldo");
		System.out.println("Escriba 2 para ingresar dinero");
		System.out.println("Escriba 3 para sacar dinero");
		System.out.println("Escriba 4 para consultar sus últimos movimientos");
		
		Scanner scanner = new Scanner (System.in);
		
		int opcionSeleccionado= scanner.nextInt();
		System.out.println("La opción que usted ha elegido es: "+ opcionSeleccionado);
		
		
	}
	
}
