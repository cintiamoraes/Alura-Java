package br.com.bitebank.banco.teste;

import br.com.bitebank.banco.Modelo.Conta;
import br.com.bitebank.banco.Modelo.ContaCorrente;
import br.com.bitebank.banco.Modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		 Object[] referencias = new Conta[5];
		 
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;
        
       // System.out.println(cc2.getNumero());
        
        
        ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
	}

}
