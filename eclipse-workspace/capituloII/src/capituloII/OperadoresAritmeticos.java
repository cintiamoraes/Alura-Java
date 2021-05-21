package capituloII;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int numeroDos = 2;
		int numeroTres = 3;
		
		int resultadoSuma = numeroDos + numeroTres;
		System.out.println("el resultado de la suma es: "+ resultadoSuma);
		
		int resultadoResta = numeroTres - numeroDos;
		System.out.println("Resta: " + resultadoResta );
		
		int numeroConCambioDeSigno = -numeroDos;
		System.out.println("si aplicamos el operador resta al numedoDos obtenemos: " + numeroConCambioDeSigno );
		
		double resultadoMultiplicacion = numeroTres * 3.5;//al multiplicarmos un tipo double con un tipo int obtenemos el tipo double como resultado
		System.out.println("\nLa multiplicación es: "+resultadoMultiplicacion);
		
		double resultadoDivision = (double)numeroDos / numeroTres;//o numeroDos foi "trasnformado" em double para executar a operação esperada
		System.out.println("La division es: "+resultadoDivision);
		
		int  resultadoModulo = numeroDos % numeroTres;
		System.out.println("El resto de dividir 2 por 3 es: " + resultadoModulo);
		
		
	}
	
}
