package AccountsManager;

import Entities.Account;
import core.ManagerEntities;

/**
 *
 * @author vlad
 */
public class RegisterModel extends ManagerEntities {
    
    public RegisterModel(String persistenceUnitName) {
        super(persistenceUnitName);
    }
    
    public void insertAccount(Account table)
    {
        BeginDataTransaction();
        InsertData(table);
        UpdateDataTransaction();
        EndDataTransaction();
    }
}