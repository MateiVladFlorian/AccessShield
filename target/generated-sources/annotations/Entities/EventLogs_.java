package Entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(EventLogs.class)
public class EventLogs_ { 

    public static volatile SingularAttribute<EventLogs, Integer> eventId;
    public static volatile SingularAttribute<EventLogs, Date> createdAt;
    public static volatile SingularAttribute<EventLogs, String> eventDetails;
    public static volatile SingularAttribute<EventLogs, String> eventType;

}