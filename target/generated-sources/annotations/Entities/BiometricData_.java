package Entities;

import Entities.AccessDevices;
import Entities.Account;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-29T18:32:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(BiometricData.class)
public class BiometricData_ { 

    public static volatile SingularAttribute<BiometricData, Account> accountId;
    public static volatile SingularAttribute<BiometricData, Integer> biometricId;
    public static volatile CollectionAttribute<BiometricData, AccessDevices> accessDevicesCollection;
    public static volatile SingularAttribute<BiometricData, String> biometricType;
    public static volatile SingularAttribute<BiometricData, Date> enrollmentDate;
    public static volatile SingularAttribute<BiometricData, String> biometricValue;
    public static volatile SingularAttribute<BiometricData, String> status;

}