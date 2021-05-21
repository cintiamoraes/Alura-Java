//Gerente � um funcion�rio e herda a class Funcionario
public class Gerente extends Funcionario{
	
		private String nome;
		private String cpf;
		private double salario;
		private int senha;
		
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public boolean autentica(int senha) {
			if (this.senha == senha) {
				return true;
			}else {
				return false;
			}
		}
		
		
		public double getBonificacao() {//Isto � chamado de assinatura do m�todo. Se olharmos para a classe Gerente, veremos que l� temos a mesma assinatura do m�todo, o que chamamos de reescrita.
			
			return super.getBonificacao() + super.getSalario(); // super significa que o atributo sal�rio est� definido na classe m�e
			
		}
				
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getCpf() {
			return cpf;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
		
	
}
