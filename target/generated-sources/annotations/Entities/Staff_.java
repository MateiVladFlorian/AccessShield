package Entities;

import Entities.AccessRoom;
import Entities.Account;
import Entities.AuditLogs;
import Entities.Feedback;
import Entities.Reservations;
import Entities.StaffRoles;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-29T18:32:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, Account> accountId;
    public static volatile CollectionAttribute<Staff, AuditLogs> auditLogsCollection;
    public static volatile SingularAttribute<Staff, Reservations> reservationId;
    public static volatile CollectionAttribute<Staff, StaffRoles> staffRolesCollection;
    public static volatile CollectionAttribute<Staff, Feedback> feedbackCollection;
    public static volatile SingularAttribute<Staff, String> name;
    public static volatile CollectionAttribute<Staff, AccessRoom> accessRoomCollection;
    public static volatile SingularAttribute<Staff, Integer> staffId;

}