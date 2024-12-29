package AccountsManager;

import Entities.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vlad
 */
public class LoginModel {
    List<Account> accounts;
    int indexAccount = 0;
    
    String Username, Password;
    
    public LoginModel(String Username, String Password) {
        accounts = new ArrayList<>();
        this.Username = Username;
        this.Password = Password;
        
        int index = (Login() == true)? indexAccount : -1;
        
        if (index != -1) {
            
        }
           
    }
    
    public boolean Login()
    {
        for (Account account : accounts) {
            if (Username.equals(account.getUsername()) && Password.equals(account.getPassword())) {    
                indexAccount++; return true;
            }
        }
        return false;
    }
}