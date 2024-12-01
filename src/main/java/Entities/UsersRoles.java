package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "users_roles")
public class UsersRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_role_id;
    
    @Column(name = "account_id", nullable = false, unique = true)
    private int account_id;
    
    @Column(name = "role", nullable = false)
    private String role;
}
