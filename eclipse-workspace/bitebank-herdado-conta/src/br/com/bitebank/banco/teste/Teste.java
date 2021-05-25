package br.com.bitebank.banco.teste;

public class Teste {

	//array
	public static void main(String[] args) {
		
		int[]idades = new int[5]; //inicializa o array com os valores padroes, ou seja, 0

        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;

        }
        
        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]); 
        }

}
}