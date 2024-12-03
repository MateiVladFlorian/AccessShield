package Entities;

import Entities.AccessRoom;
import Entities.Amenities;
import Entities.Cazari;
import Entities.Feedback;
import Entities.MaintenanceLogs;
import Entities.Reservations;
import Entities.Reviews;
import Entities.RoomAccessCards;
import Entities.RoomServices;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Rooms.class)
public class Rooms_ { 

    public static volatile SingularAttribute<Rooms, String> roomNumber;
    public static volatile CollectionAttribute<Rooms, Reservations> reservationsCollection;
    public static volatile CollectionAttribute<Rooms, Amenities> amenitiesCollection;
    public static volatile CollectionAttribute<Rooms, Feedback> feedbackCollection;
    public static volatile CollectionAttribute<Rooms, RoomServices> roomServicesCollection;
    public static volatile CollectionAttribute<Rooms, Reviews> reviewsCollection;
    public static volatile SingularAttribute<Rooms, Integer> roomId;
    public static volatile CollectionAttribute<Rooms, RoomAccessCards> roomAccessCardsCollection;
    public static volatile SingularAttribute<Rooms, Integer> capacity;
    public static volatile SingularAttribute<Rooms, Cazari> accountId;
    public static volatile CollectionAttribute<Rooms, MaintenanceLogs> maintenanceLogsCollection;
    public static volatile CollectionAttribute<Rooms, AccessRoom> accessRoomCollection;
    public static volatile SingularAttribute<Rooms, String> roomType;
    public static volatile SingularAttribute<Rooms, String> status;

}