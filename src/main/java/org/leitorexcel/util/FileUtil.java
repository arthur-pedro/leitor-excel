package org.leitorexcel.util;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.FileImageOutputStream;

public class FileUtil {

	private static final String USER_AGENT = "User-Agent";
	private static final String PROPERTY = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31";
	private static final String JPG_FORMAT = "jpg";

	public static void createFileFromURL(String imageUrl, String filePath) throws IOException {

		URL url = new URL(imageUrl);
		URLConnection openConnection = url.openConnection();
		openConnection.setRequestProperty(USER_AGENT, PROPERTY);
		openConnection.connect();

		InputStream in = new BufferedInputStream(openConnection.getInputStream());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1 != (n = in.read(buf))) {
			out.write(buf, 0, n);
		}
		out.close();
		in.close();
		byte[] response = out.toByteArray();
		BufferedImage img = ImageIO.read(new ByteArrayInputStream(response));

		JPEGImageWriteParam jpegParams = new JPEGImageWriteParam(null);
		jpegParams.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
		jpegParams.setCompressionQuality(0.1f);
		File file = new File(filePath);

		final ImageWriter writer = ImageIO.getImageWritersByFormatName(JPG_FORMAT).next();
		writer.setOutput(new FileImageOutputStream(file));
		writer.write(null, new IIOImage(img, null, null), jpegParams);
	}

}
