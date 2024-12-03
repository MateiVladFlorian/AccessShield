package core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author vlad
 */
public class AccountsUtil {
    static int state;
    
    public static void setStatus(int status) {
        state = status;
    }
    
    public static int getStatus() {
        return state;
    }
    
    public static String GenerateSHA512(String input)
    {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            byte[] encodedhash = digest.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            
            for (byte b : encodedhash) hexString.append(String.format("%02x", b));

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-512 Algorithm not found", e);
        }
    }
}
