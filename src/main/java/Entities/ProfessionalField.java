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
@Table(name = "professionalField")
public class ProfessionalField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "account_id", nullable = false, unique = true)
    private int account_id;
    
    @Column(name = "ProfessionalName", nullable = false)
    private String professionalName;
    
    @Column(name = "CodIdentificare", nullable = false, unique = true)
    private String codIdentificare;
}
