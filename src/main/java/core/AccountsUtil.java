package core;

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
}
