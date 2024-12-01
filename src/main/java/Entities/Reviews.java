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
@Table(name = "reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    
    @Column(name = "account_id", nullable = false)
    private int account_id;
    
    @Column(name = "room_id", nullable = false)
    private int room_id;
    
    @Column(name = "rating")
    private int rating;
    
    @Column(name = "comment")
    private String comment;
    
    @Column(name = "created_at")
    private LocalDateTime created_at; 
}
