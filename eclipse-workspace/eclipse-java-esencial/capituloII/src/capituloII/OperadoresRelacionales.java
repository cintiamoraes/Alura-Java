package capituloII;

public class OperadoresRelacionales {
	
	public static void main(String[] args) {
		
		boolean esUnoMayorQueDos = 1 > 2;
		System.out.println("Uno es mayor que dos? " + esUnoMayorQueDos);
		
		boolean esUnoComaCincoMenorQueSieteComaDos = 1.5 < 7.2;
		
		System.out.println("1.5 es menor que 7.2? " + esUnoComaCincoMenorQueSieteComaDos);
		
		boolean esOchoMayorIgualQueOcho = 8 >= 8;
		System.out.println ("8 es mayor o igual a 8? " + esOchoMayorIgualQueOcho);
		
		boolean esTresComaUnoIgualQueTresComaDos = 3.1 == 3.2;
		System.out.println ("3.1 es igual a 3.2? " + esOchoMayorIgualQueOcho);
		
		boolean esCuatroDiferenteDeCuatro = 4!= 4;
		System.out.println ("4 es diferente de 4? " + esCuatroDiferenteDeCuatro);
		
		String perro = "perro";
		String gato = "gato";
		System.out.println("Es verdad que el String perro es igual que el String gato? " + perro == gato);
		
		
		
		
		
		
		
		
	}

}
