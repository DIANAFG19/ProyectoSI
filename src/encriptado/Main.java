package encriptado;

import java.util.Scanner;

/*
 * @author YOO
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String key = "92AE31A79FEEB2A3"; //llave
        String iv = "0123456789ABCDEF"; // vector
        
        System.out.println("Escribe lo que quieras encriptar: ");
        
        Scanner entrada = new Scanner(System.in);
        String cleartext = entrada.nextLine();
        
        //System.out.println("Texto encriptado: " + encriptado.StringEncrypt.encrypt(key,));
        //System.out.println("Texto desencriptado: " + encriptado.StringEncrypt.decrypt(key, iv, encriptado.StringEncrypt.encrypt(key, iv, cleartext)));
    }
}
