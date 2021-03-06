package br.com.bitebank.banco.teste;


public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		br.com.bitebank.banco.Modelo.GuardadorDeContas guardador = new br.com.bitebank.banco.Modelo.GuardadorDeContas();
		
		br.com.bitebank.banco.Modelo.Conta cc = new br.com.bitebank.banco.Modelo.ContaCorrente(22, 11);
		guardador.adiciona(cc);

		br.com.bitebank.banco.Modelo.Conta cc2 = new br.com.bitebank.banco.Modelo.ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		br.com.bitebank.banco.Modelo.Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}

}
