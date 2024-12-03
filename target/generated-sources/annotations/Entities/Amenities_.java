package Entities;

import Entities.Rooms;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Amenities.class)
public class Amenities_ { 

    public static volatile CollectionAttribute<Amenities, Rooms> roomsCollection;
    public static volatile SingularAttribute<Amenities, Integer> amenityId;
    public static volatile SingularAttribute<Amenities, String> amenityName;
    public static volatile SingularAttribute<Amenities, String> description;

}