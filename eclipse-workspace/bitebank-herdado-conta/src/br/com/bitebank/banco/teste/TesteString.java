package br.com.bitebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		
		//String vazio =" ";
		//String outroVazio = vazio.trim(); //trim retira todos os espa�os vazios da string
		//System.out.println(outroVazio.isEmpty());
		
		String vazio ="    Alura    ";
		String outroVazio = vazio.trim(); 
		System.out.println(vazio.contains("Alu"));
		
		
		String nome = "Alura";// object literal

		System.out.println(nome.length());
		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		}
		
		// String outra = nome.replace("A","a");
		//System.out.println(nome);
		// nome.toLowerCase();

		//char c = 'A';
		//char d = 'a';
		//String outra = nome.replace(c, d);
		//System.out.println(outra);
		
		//char c = nome.charAt(2);
		//System.out.println(c);

		
	}

}
