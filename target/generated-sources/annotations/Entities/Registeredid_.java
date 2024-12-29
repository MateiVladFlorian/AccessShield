package Entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-29T18:32:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Registeredid.class)
public class Registeredid_ { 

    public static volatile SingularAttribute<Registeredid, Date> createdAt;
    public static volatile SingularAttribute<Registeredid, Integer> biometricDataId;
    public static volatile SingularAttribute<Registeredid, Integer> billingInfoId;
    public static volatile SingularAttribute<Registeredid, Integer> roomAccessCardsId;
    public static volatile SingularAttribute<Registeredid, Integer> feedbackId;
    public static volatile SingularAttribute<Registeredid, Integer> id;
    public static volatile SingularAttribute<Registeredid, Integer> paymentsId;
    public static volatile SingularAttribute<Registeredid, Integer> roomsId;
    public static volatile SingularAttribute<Registeredid, Integer> reservationsId;
    public static volatile SingularAttribute<Registeredid, Integer> paymentGatewaysId;

}