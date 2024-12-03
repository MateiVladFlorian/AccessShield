package Entities;

import Entities.Account;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Transactions.class)
public class Transactions_ { 

    public static volatile SingularAttribute<Transactions, Account> accountId;
    public static volatile SingularAttribute<Transactions, BigDecimal> amount;
    public static volatile SingularAttribute<Transactions, String> paymentMethod;
    public static volatile SingularAttribute<Transactions, Date> transactionDate;
    public static volatile SingularAttribute<Transactions, Integer> transactionId;
    public static volatile SingularAttribute<Transactions, String> status;

}