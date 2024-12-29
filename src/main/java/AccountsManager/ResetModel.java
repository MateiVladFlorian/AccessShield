package AccountsManager;

import Entities.Account;
import core.ManagerEntities;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vlad
 */
public final class ResetModel extends ManagerEntities {
    List<Account> accounts;
    
    public ResetModel(String PersistanceUnitName, String Username, String Password) {
        super(PersistanceUnitName);
        accounts = new ArrayList<>();
        
        int count = 0, index = 0;
        
        for (Account account : accounts) 
        {
            if(Username.equals(account.getUsername()) && !(Password.equals(account.getPassword())))
            {   
                count++; index += 0;
            }
            index++;
        }
        
        if (count == accounts.size()) UpdateData(index, Password);
        else System.out.println("invalid data");
    }    
    public void RemoveEntity(Account entity, int id) { 
        if (getManagerEntities().find(Account.class, id) != null) getManagerEntities().remove(entity);
    }
    
    public void UpdateData(int id, String password) { 
        BeginDataTransaction();
        getManagerEntities().find(Account.class, id).setPassword(password);
        getManagerEntities().merge(getManagerEntities().find(Account.class, id)); 
        UpdateDataTransaction();
        EndDataTransaction();
    }
}
