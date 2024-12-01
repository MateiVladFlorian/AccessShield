package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "rooms")
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int room_id;
    
    @Column(name = "account_id", nullable = false)
    private int account_id;
    
    @Column(name = "room_number", nullable = false)
    private String room_number;
    
    @Column(name = "room_type", nullable = false)
    private String room_type;
    
    @Column(name = "capacity")
    private int capacity;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "price_per_night", nullable = false)
    private BigDecimal pricePerNight;
    
    @Column(name = "price_per_monthly", nullable = false)
    private BigDecimal pricePerMonthly;
}