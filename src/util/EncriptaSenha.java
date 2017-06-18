

package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class EncriptaSenha {

    public static String encripta(String senha) {

try {
        //digester criado com algoritmo MD5
	MessageDigest digest = MessageDigest.getInstance("MD5");
	//o metodo update adiciona bytes a mensagem a ser criptografada
        digest.update(senha.getBytes());
        //cria-se um encoder para impedir que a senha encriptada apareça
	BASE64Encoder encoder = new BASE64Encoder();
        //o metodo digest.digest() retorna a mensagem encriptada
	return encoder.encode(digest.digest());

} catch (NoSuchAlgorithmException ns) {
	ns.printStackTrace();
	return senha;

}
    }
}

