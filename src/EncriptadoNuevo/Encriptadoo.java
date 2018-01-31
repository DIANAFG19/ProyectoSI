package EncriptadoNuevo;

/*
 * @author YOO
 */

import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

public class Encriptadoo {

    public static void main(String[] args) {
        
        System.out.println("Escribe lo que quieras encriptar: ");
        
        Scanner entrada = new Scanner(System.in);
        String textoSinEncriptar = entrada.nextLine();

        String textoEncriptadoConMD5 = DigestUtils.md5Hex(textoSinEncriptar);
        System.out.println("Texto Encriptado con MD5 : " + textoEncriptadoConMD5);

        String textoEncriptadoConSHA = DigestUtils.sha1Hex(textoSinEncriptar);
        System.out.println("Texto Encriptado con SHA : " + textoEncriptadoConSHA);
    }
}
