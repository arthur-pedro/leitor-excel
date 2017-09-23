package teste;
/*
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.json.JSONObject;
*/
public class TestImage {

    public static void main(String[] args) {
    	
    
    	/*
    	try{
            URL url = new URL("https://www.google.com.br/search?safe=off&biw=1366&bih=623&tbm=isch&sa=1&q=0000078936683&oq=0000078936683&gs_l=psy-ab.3...0.0.0.699712.0.0.0.0.0.0.0.0..0.0....0...1..64.psy-ab..0.0.0....0.Granm79qTqM");
            URLConnection connection = url.openConnection();

            String line;
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while((line = reader.readLine()) != null) {
                builder.append(line);
            }

            JSONObject json = new JSONObject(builder.toString());
            String imageUrl = json.getJSONObject("responseData").getJSONArray("results").getJSONObject(0).getString("url");

            BufferedImage image = ImageIO.read(new URL(imageUrl));
            JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(image));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
*/
   }
}