package br.com.alura.bitebank;

import br.com.bitebank.banco.Modelo.Conta;
import br.com.bitebank.banco.Modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123,321);
		c.deposita(200.3);
		
		System.out.println(c.getSaldo());
		
	}

}
