
public class Cliente implements Autenticavel {//quando vc clica no cliente o Java j? auxilai na implementa??o das obriga??es l? da clsss Autentic?vel

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//gera os m?todos concretos setSenha e autentica
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
