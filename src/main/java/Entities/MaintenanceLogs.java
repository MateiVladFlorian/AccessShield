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
@Table(name = "maintenance_logs")
public class MaintenanceLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maintenance_id;
    
    @Column(name = "room_id", nullable = false)
    private int room_id;
    
    @Column(name = "maintenance_type", nullable = false)
    private String maintenance_type;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "maintenance_date")
    private LocalDateTime maintenance_date;
}
