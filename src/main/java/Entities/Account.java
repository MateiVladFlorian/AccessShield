package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author vlad
 */

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "UserName", nullable = false, unique = true)
    private String username;
    
    @Column(name = "Email", nullable = false, unique = true)
    private String emailaddress;
    
    @Column(name = "Password", nullable = false, unique = true)
    private String password;
    
    @Column(name = "CNP", nullable = false, unique = true)
    private String cnp;
    
    @Column(name = "Location", nullable = false)
    private String location;
    
    @Column(name = "Status", nullable = false)
    private String status;
    
    @Column(name = "DateTimeConnected", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime DateTimeConnected;
    
    @Column(name = "IsLoged", columnDefinition = "BOOLEAN DEFAULT 0")
    private Boolean isLoged;
}
