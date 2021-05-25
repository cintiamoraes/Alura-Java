
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();

		} catch (IllegalStateException ex) {

			System.out.println("Deu erro na conexao");
		}
	}
}

// ----------------------------------------------------------------
//O c�digo abaixo est� sendo substitu�do pelo c�digo acima

//	    Conexao con = null;
//	    try {
//	        con = new Conexao();
//	        con.leDados();
//	        
//	        //indica que o objeto utilizado tem um estado inconsistente.
//	        //O IllegalStateException estende de RuntimeException e � uma exce��o do tipo unchecked.
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//	        
//	        //O finally � opcional que colocamos ao final e que sempre ser� executado, com ou sem erro. 
//	        //N�o � necess�rio repetir o c�digo para fechar a conex�o.
//	    } finally {
//	        con.fecha();
//	    }
//	}
//}
