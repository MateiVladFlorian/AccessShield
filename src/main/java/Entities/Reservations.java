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
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservation_id;
    
    @Column(name = "account_id", nullable = false)
    private int account_id;
    
    @Column(name = "room_id", nullable = false)
    private int room_id;
    
    @Column(name = "check_in")
    private LocalDateTime check_in;
    
    @Column(name = "check_out")
    private LocalDateTime check_out;
    
    @Column(name = "status")
    private String status;
}
