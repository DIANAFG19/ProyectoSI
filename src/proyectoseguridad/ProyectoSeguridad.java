package proyectoseguridad;
/*
 * @author YOO
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.commons.codec.binary.Base64;

public class ProyectoSeguridad {

    public static void main(String[] args) {
        Base64 base64 = new Base64();
        /*----------------ARCHIVOS------------------*/

		File file = new File("C:\\Users\\YOO\\Desktop\\ProyectoSeguridad");
		byte[] fileArray = new byte[(int) file.length()];
		InputStream inputStream;

		String encodedFile = "";
		try {
			inputStream = new FileInputStream(file);
			inputStream.read(fileArray);
			encodedFile = base64.encodeToString(fileArray);
		} catch (Exception e) {
			// Manejar Error
		}
		System.out.println(encodedFile);

		/*----------------CADENAS------------------*/
		String cadena = "Cadena";
		String encodedString = "";
		encodedString = base64.encodeToString(cadena.getBytes());
		System.out.println(encodedString);
    }
    
}
