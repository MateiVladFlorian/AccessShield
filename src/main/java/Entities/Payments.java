package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;
    
    @Column(name = "account_id", nullable = false)
    private int account_id;
    
    @Column(name = "reservation_id", nullable = false)
    private int reservation_id;
    
    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
    
    @Column(name = "payment_date")
    private LocalDateTime payment_date;
    
    @Column(name = "payment_status")
    private String payment_status;
}