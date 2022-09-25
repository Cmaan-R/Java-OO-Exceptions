
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao() ) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu Erro Na Conexão");
		}
		
		
//		----------------------------------

//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu Erro Na Conexão");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.close();
//			}
//		}
//
	}

}
	
