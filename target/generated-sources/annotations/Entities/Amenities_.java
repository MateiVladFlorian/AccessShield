package Entities;

import Entities.Rooms;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-01T23:31:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Amenities.class)
public class Amenities_ { 

    public static volatile CollectionAttribute<Amenities, Rooms> roomsCollection;
    public static volatile SingularAttribute<Amenities, Integer> amenityId;
    public static volatile SingularAttribute<Amenities, String> amenityName;
    public static volatile SingularAttribute<Amenities, String> description;

}