package br.com.bitebank.banco.teste;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		br.com.bitebank.banco.Modelo.ContaCorrente cc = new br.com.bitebank.banco.Modelo.ContaCorrente (222,333);		
		cc.deposita(100.0);
		
		br.com.bitebank.banco.Modelo.SeguroDeVida seguro = new br.com.bitebank.banco.Modelo.SeguroDeVida();
		
		br.com.bitebank.banco.Modelo.CalculadorDeImposto calc = new br.com.bitebank.banco.Modelo.CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
