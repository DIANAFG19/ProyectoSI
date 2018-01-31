package EncriptadoNuevo;

/*
 * @author YOO
 */

import org.apache.commons.codec.digest.DigestUtils;

public class Encriptadoo {

    public static void main(String[] args) {
        
        String textoSinEncriptar = "DIANA LAURA FLORES GARCÍA";
        
        String textoEncriptadoConMD5 = DigestUtils.md5Hex(textoSinEncriptar);
        System.out.println("Texto Encriptado con MD5 : " + textoEncriptadoConMD5);

        String textoEncriptadoConSHA = DigestUtils.sha1Hex(textoSinEncriptar);
        System.out.println("Texto Encriptado con SHA : " + textoEncriptadoConSHA);
    }
}
