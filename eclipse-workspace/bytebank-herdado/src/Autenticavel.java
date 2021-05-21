
//contrato Autenticavel
//quem assina esse contrato, precisa implementar o metodo setSenha e o metodo autentica

public abstract interface Autenticavel {//todos os métodos dentro de uma interface tem que ser abstrato
	
	public abstract void setSenha(int senha) ;
	
	public abstract boolean autentica(int senha) ;
}
