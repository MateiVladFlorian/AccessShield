package Entities;

import Entities.Rooms;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-01T23:31:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cazari.class)
public class Cazari_ { 

    public static volatile CollectionAttribute<Cazari, Rooms> roomsCollection;
    public static volatile SingularAttribute<Cazari, String> tipcazare;
    public static volatile SingularAttribute<Cazari, String> codidentificare;
    public static volatile SingularAttribute<Cazari, String> adresa;
    public static volatile SingularAttribute<Cazari, Integer> id;
    public static volatile SingularAttribute<Cazari, String> numelocatie;
    public static volatile SingularAttribute<Cazari, Integer> nrcamere;

}