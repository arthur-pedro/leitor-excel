package teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class RepositorioProduto {

	public void buscarId() throws IOException {

		FileInputStream fisPlanilha = null;

		try {

			// classe que baixa a imagem
			Arquivo arquivo = new Arquivo();

			// guarda a planilha na variavel - file
			File file = new File("C:\\Planilha\\PlanilhaProduto.xls");
			fisPlanilha = new FileInputStream(file);

			// cria workbook = planilha toda
			HSSFWorkbook workbook = new HSSFWorkbook(fisPlanilha);

			// le apenas a primeira planilha
			HSSFSheet sheet = workbook.getSheetAt(0);

			// cria uma lista
			ArrayList<String> list = new ArrayList<String>();

			for (Row row : sheet) { // pra cada linha
				Cell cell = row.getCell(0); // pega o index da celula / coluna
											// que eu quero

				if (cell != null && cell.getRowIndex() != 0) {

					Long teste = 0L;
					
					if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
						teste = (long) cell.getNumericCellValue();
					} else if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
						teste = Long.parseLong(cell.getStringCellValue());
					}
					list.add(teste.toString());
				}

			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			// ----------------------------TESTE------------------------------
			String id = null;
			Scanner sc = new Scanner(System.in);

			System.out.println("ID DO PRODUTO: ");
			id = sc.nextLine();
			// se o id pesquisado existir na planilha, pesquisa o id e baixa a
			// imagem
			if (list.contains(id)) {
				arquivo.pegarArquivo("http://at.dlogica.com.br/ppwfotos/3098.jpg");
				//System.out.println("ok"+id);

			} else {

				System.out.println("ID INVALIDO");

			}

			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
