package Entities;

import Entities.Account;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(BillingInfo.class)
public class BillingInfo_ { 

    public static volatile SingularAttribute<BillingInfo, Date> expiryDate;
    public static volatile SingularAttribute<BillingInfo, Account> accountId;
    public static volatile SingularAttribute<BillingInfo, Integer> billingId;
    public static volatile SingularAttribute<BillingInfo, String> cardType;
    public static volatile SingularAttribute<BillingInfo, String> billingAddress;
    public static volatile SingularAttribute<BillingInfo, String> cardNumber;

}