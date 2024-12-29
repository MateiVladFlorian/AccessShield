package Entities;

import Entities.Account;
import Entities.AuditLogs;
import Entities.BillingInfo;
import Entities.Feedback;
import Entities.Payments;
import Entities.ReservationsHistory;
import Entities.Rooms;
import Entities.Staff;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-29T18:32:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Reservations.class)
public class Reservations_ { 

    public static volatile SingularAttribute<Reservations, Account> accountId;
    public static volatile SingularAttribute<Reservations, BillingInfo> billingId;
    public static volatile SingularAttribute<Reservations, Date> checkIn;
    public static volatile CollectionAttribute<Reservations, AuditLogs> auditLogsCollection;
    public static volatile CollectionAttribute<Reservations, ReservationsHistory> reservationsHistoryCollection;
    public static volatile SingularAttribute<Reservations, Integer> reservationId;
    public static volatile CollectionAttribute<Reservations, Payments> paymentsCollection;
    public static volatile CollectionAttribute<Reservations, Feedback> feedbackCollection;
    public static volatile CollectionAttribute<Reservations, Staff> staffCollection;
    public static volatile SingularAttribute<Reservations, Date> checkOut;
    public static volatile SingularAttribute<Reservations, Rooms> roomId;
    public static volatile SingularAttribute<Reservations, String> status;

}