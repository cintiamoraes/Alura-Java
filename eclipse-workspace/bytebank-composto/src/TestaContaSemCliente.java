
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		//Faremos com que titular deixe de ser null, fazendo-o receber um novo cliente: new Cliente.
		contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome= "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
	}

}
