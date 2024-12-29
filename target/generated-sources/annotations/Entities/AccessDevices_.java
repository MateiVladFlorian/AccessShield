package Entities;

import Entities.AccessLogs;
import Entities.BiometricData;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-29T18:32:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(AccessDevices.class)
public class AccessDevices_ { 

    public static volatile SingularAttribute<AccessDevices, String> deviceType;
    public static volatile SingularAttribute<AccessDevices, Date> lastMaintenance;
    public static volatile CollectionAttribute<AccessDevices, AccessLogs> accessLogsCollection;
    public static volatile SingularAttribute<AccessDevices, BiometricData> biometricId;
    public static volatile SingularAttribute<AccessDevices, Date> installationDate;
    public static volatile SingularAttribute<AccessDevices, String> location;
    public static volatile SingularAttribute<AccessDevices, Integer> deviceId;
    public static volatile SingularAttribute<AccessDevices, String> status;

}