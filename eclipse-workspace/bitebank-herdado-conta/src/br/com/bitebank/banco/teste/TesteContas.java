package br.com.bitebank.banco.teste;

import br.com.bitebank.banco.especial.ContaEspecial;

//br.com.bitebank.banco.teste.TesteContas
public class TesteContas {

    public static void main(String[] args) throws br.com.bitebank.banco.Modelo.SaldoInsuficienteException{
    	
    	//Full Qualified Name ou FQN.
    	
    	    	
        br.com.bitebank.banco.Modelo.ContaCorrente cc = new br.com.bitebank.banco.Modelo.ContaCorrente(111, 111);
        cc.deposita(100.0);

        br.com.bitebank.banco.Modelo.ContaPoupanca cp = new br.com.bitebank.banco.Modelo.ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(110.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}