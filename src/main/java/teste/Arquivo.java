package teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Arquivo {

	
	public void pegarArquivo(String link) throws IOException {
		
		URL url = new URL(link);

		String destino = "C:\\Planilha\\produtos\\exemplo.jpg";
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream(destino);

		int bytes = 0;
		while ((bytes = is.read()) != -1) {
			fos.write(bytes);
		}
		is.close();
		fos.close();
	}
}

/*
 * //---------------------------------------------------------------------
 * 
 * JFileChooser chooser = new JFileChooser();
 * 
 * FileNameExtensionFilter ft = new FileNameExtensionFilter("Image Files",
 * "jpg", "png", "jpeg"); //FileFilter ft2 = new
 * FileNameExtensionFilter("PDF Files", "pdf");
 * 
 * chooser.addChoosableFileFilter(ft); //chooser.addChoosableFileFilter(ft2);
 * chooser.showOpenDialog(null); File f = chooser.getSelectedFile(); filePath =
 * f.getAbsolutePath().toString();
 * 
 * BufferedImage img = null; try { img = ImageIO.read(new File(filePath)); }
 * catch (IOException e) { e.printStackTrace(); }
 * 
 * Image dimg = img.getScaledInstance(lblAttachment.getWidth(),
 * lblAttachment.getHeight(), Image.SCALE_SMOOTH);
 * 
 * 
 * ImageIcon icon = new ImageIcon(dimg); lblAttachment.setText("");
 * lblAttachment.setIcon(icon);
 */
// ---------------------------------------------------------------------
