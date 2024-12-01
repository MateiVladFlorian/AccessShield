
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
@Table(name = "notifications")
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notification_id;
    
    @Column(name = "account_id", nullable = false)
    private int account_id;
    
    @Column(name = "message", nullable = false)
    private String message;
    
    @Column(name = "notification_type")
    private String notification_type;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "sent_at")
    private LocalDateTime sent_at;
}