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
@Table(name = "room_services")
public class RoomServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int service_id;
    
    @Column(name = "room_id", nullable = false)
    private int room_id;
    
    @Column(name = "service_type", nullable = false)
    private String service_type;
    
    @Column(name = "service_description")
    private String service_description;
    
    @Column(name = "service_time")
    private LocalDateTime service_time;
}
