package Entities;

import Entities.Account;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-01T23:31:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Notifications.class)
public class Notifications_ { 

    public static volatile SingularAttribute<Notifications, Account> accountId;
    public static volatile SingularAttribute<Notifications, Integer> notificationId;
    public static volatile SingularAttribute<Notifications, String> notificationType;
    public static volatile SingularAttribute<Notifications, Date> sentAt;
    public static volatile SingularAttribute<Notifications, String> message;
    public static volatile SingularAttribute<Notifications, String> status;

}