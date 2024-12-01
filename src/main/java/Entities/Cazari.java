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
@Table(name = "cazari")
public class Cazari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "account_id", nullable = false)
    private int account_id;
    
    @Column(name = "payment_id", nullable = false)
    private int payment_id;
    
    @Column(name = "NumeLocatie", nullable = false)
    private String NumeLocatie;
    
    @Column(name = "Adresa", nullable = false)
    private String Adresa;
    
    @Column(name = "TipCazare", nullable = false)
    private String tipCazare;
    
    @Column(name = "NrCamere", nullable = false)
    private int nrCamere;
    
    @Column(name = "CodIdentificare", nullable = false, unique = true)
    private String codIdentificare;
}
