package br.com.bitebank.banco.teste;

import br.com.bitebank.banco.Modelo.Cliente;
import br.com.bitebank.banco.Modelo.ContaCorrente;
import br.com.bitebank.banco.Modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) { 

//	    System.out.println("x");
//	    System.out.println(3);
//	    System.out.println(false);

	ContaCorrente cc = new ContaCorrente(22, 33);
	Object cp = new ContaPoupanca(33, 22);
	Object cliente = new Cliente();

	System.out.println(cc.toString());
	System.out.println(cp);
	
	}
	
}