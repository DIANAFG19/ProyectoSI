package EncryptDesencrypt;
/*
 * @author YOO
 */

public class EncrypDesencrypt {
    public static void main(String[] args) throws Exception {
 
        String encriptado = FuncionesED.Encriptar("Esto es una prueba");
        System.out.println(encriptado);
        String desencriptado = FuncionesED.Desencriptar(encriptado);
        System.out.println(desencriptado);
    }
}
