package capituloII;

public class OperadoresLogicos {

	public static void main(String[] args) {

		// Operador & - and
		System.out.println("false & false es: " + (false & false));
		System.out.println("true & false es: " + (true & false));
		System.out.println("false & true es: " + (false & true));
		System.out.println("true & true es: " + (true & true));

		// Operador && - and de circuito corto
		System.out.println("false && false es: " + (false && false));
		System.out.println("true && false es: " + (true && false));
		System.out.println("false && true es: " + (false && true));
		System.out.println("true && true es: " + (true && true));

		// Operador | - or Hay también el operador or de circuito corto que evalua solo el primero		 
		System.out.println("false | false es: " + (false | false));
		System.out.println("true | false es: " + (true | false));
		System.out.println("false | true es: " + (false | true));
		System.out.println("true | true es: " + (true | true));

		// Operador Equis or ^ 
		System.out.println("false ^ false es: " + (false ^ false));
		System.out.println("true ^ false es: " + (true ^ false));
		System.out.println("false ^ true es: " + (false ^ true));
		System.out.println("true ^ true es: " + (true ^ true));
		
		// cambia de true a false y de false a true
		System.out.println("!false es: " + !false);
		System.out.println("!true es: " + !true);
		
		

	}

}
