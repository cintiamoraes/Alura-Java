package br.com.bitebank.banco.Modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {

		super(agencia, numero);// reaproveitamento do construtor da classe mae
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
	
	@Override
	public String toString() {///este m�todo to string est� sobrescrevendo ol� no TesteJava
		
		return "ContaPoupanca, " + super.toString();
	}

}
