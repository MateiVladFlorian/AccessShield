package ManagerIdEntities;

import Entities.Registeredid;
import core.ManagerEntities;

/**
 *
 * @author vlad
 */

public class RegisteredId extends ManagerEntities {
    private Registeredid registered;
    
    public RegisteredId(String PersistanceUnitName) {
        super(PersistanceUnitName);
        registered = new Registeredid();
    }
    
    public void AddIds(int[] ids)
    {
        registered.setAccountId(ids[0]);
        registered.setFeedbackId(ids[1]);
        registered.setRoomsId(ids[2]);
        registered.setPaymentsId(ids[3]);
        registered.setReservationsId(ids[4]);
        registered.setBillingInfoId(ids[5]);
        registered.setRoomAccessCardsId(ids[6]);   
        registered.setBiometricDataId(ids[7]);
        registered.setPaymentGatewaysId(ids[8]);
        
        BeginDataTransaction();
        InsertData(registered);
        UpdateDataTransaction();
        EndDataTransaction();
    }
}
