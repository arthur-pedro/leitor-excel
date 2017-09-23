package teste;

import java.io.IOException;

public class TesteProcurarProduto {
	
	public static void main(String[] args){
		
		RepositorioProduto rp = new RepositorioProduto();
		
		try {
			
			rp.buscarId();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
