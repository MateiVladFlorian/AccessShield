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
@Table(name = "users_sessions")
public class UsersSessions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int session_id;
    
    @Column(name = "account_id", nullable = false)
    private int account_id;
    
    @Column(name = "device_id", nullable = false)
    private String device_id;
    
    @Column(name = "last_activity", nullable = false)
    private LocalDateTime last_activity;
    
    @Column(name = "created_at")
    private LocalDateTime created_at;
    
    @Column(name = "is_active")
    private boolean is_active;
}
