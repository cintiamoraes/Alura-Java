
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario cintia = new Funcionario();
		
		cintia.setNome("C�ntia Moraes");
		cintia.setCpf("999.999.999-99");
		cintia.setSalario(4000.00);
		
		System.out.println(cintia.getNome());
		System.out.println(cintia.getBonificacao());
		
		
		
	}

}