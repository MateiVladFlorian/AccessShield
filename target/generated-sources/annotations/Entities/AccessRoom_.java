package Entities;

import Entities.AccessLogs;
import Entities.Account;
import Entities.Rooms;
import Entities.Staff;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(AccessRoom.class)
public class AccessRoom_ { 

    public static volatile SingularAttribute<AccessRoom, Integer> accessId;
    public static volatile CollectionAttribute<AccessRoom, AccessLogs> accessLogsCollection;
    public static volatile SingularAttribute<AccessRoom, Account> accountId;
    public static volatile SingularAttribute<AccessRoom, Date> exitTime;
    public static volatile SingularAttribute<AccessRoom, Boolean> accessGranted;
    public static volatile SingularAttribute<AccessRoom, String> accessReason;
    public static volatile SingularAttribute<AccessRoom, Rooms> roomId;
    public static volatile SingularAttribute<AccessRoom, Staff> staffId;
    public static volatile SingularAttribute<AccessRoom, Date> accessTime;
    public static volatile SingularAttribute<AccessRoom, String> status;

}