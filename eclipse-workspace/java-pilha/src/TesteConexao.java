
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
//O código abaixo está sendo substituído pelo código acima

//	    Conexao con = null;
//	    try {
//	        con = new Conexao();
//	        con.leDados();
//	        
//	        //indica que o objeto utilizado tem um estado inconsistente.
//	        //O IllegalStateException estende de RuntimeException e é uma exceção do tipo unchecked.
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//	        
//	        //O finally é opcional que colocamos ao final e que sempre será executado, com ou sem erro. 
//	        //Não é necessário repetir o código para fechar a conexão.
//	    } finally {
//	        con.fecha();
//	    }
//	}
//}
