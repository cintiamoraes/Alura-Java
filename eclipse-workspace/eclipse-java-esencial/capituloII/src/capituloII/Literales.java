package capituloII;

public class Literales {

	public static void main(String[] args) {
		
		int enteroDecimal = 100; // 100 es un entero decimal 
		int enteroOctal = 0100; //0100 es 64 en sistema decimal
		int enteroHexadecimal = 0x100;// es equivalente a 256 em hexadecimal
		
		System.out.println("enteroHexadecimal es " + enteroHexadecimal);
		
		long numeroLong = 100L;
		
		double numeroDouble = 2.5;
		
		float  numeroFloat = 2.5f;
		
		int numeroConGuiones = 25_258_236;
		System.out.println("El numeroConGuiones es: "+ numeroConGuiones);//internamente es igual sin ellos
		
		char miChar = 'b';
		char miOtroChar = '\u0062';//con un c�digo Unicode. O u significa unicode
		System.out.println("El car�cter miotrochar es: " + miOtroChar );
		
		char comillaSimple = '\'';
		
		String stringLiteral = "Esto es un literal";
		
		boolean booleanoVerdadero = true;
		boolean booleanoFalso = false;
		
		
		
		
		
		
		
		
	}
}
