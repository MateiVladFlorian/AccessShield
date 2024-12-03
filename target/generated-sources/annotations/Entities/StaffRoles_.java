package Entities;

import Entities.Staff;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(StaffRoles.class)
public class StaffRoles_ { 

    public static volatile SingularAttribute<StaffRoles, Integer> roleId;
    public static volatile SingularAttribute<StaffRoles, String> roleName;
    public static volatile SingularAttribute<StaffRoles, String> description;
    public static volatile SingularAttribute<StaffRoles, Staff> staffId;

}