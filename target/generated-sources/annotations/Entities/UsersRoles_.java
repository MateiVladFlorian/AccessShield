package Entities;

import Entities.Account;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-03T03:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(UsersRoles.class)
public class UsersRoles_ { 

    public static volatile SingularAttribute<UsersRoles, Account> accountId;
    public static volatile SingularAttribute<UsersRoles, String> role;
    public static volatile SingularAttribute<UsersRoles, Integer> userRoleId;

}