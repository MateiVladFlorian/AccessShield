/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "cazari")
@NamedQueries({
    @NamedQuery(name = "Cazari.findAll", query = "SELECT c FROM Cazari c"),
    @NamedQuery(name = "Cazari.findById", query = "SELECT c FROM Cazari c WHERE c.id = :id"),
    @NamedQuery(name = "Cazari.findByNumelocatie", query = "SELECT c FROM Cazari c WHERE c.numelocatie = :numelocatie"),
    @NamedQuery(name = "Cazari.findByAdresa", query = "SELECT c FROM Cazari c WHERE c.adresa = :adresa"),
    @NamedQuery(name = "Cazari.findByTipcazare", query = "SELECT c FROM Cazari c WHERE c.tipcazare = :tipcazare"),
    @NamedQuery(name = "Cazari.findByNrcamere", query = "SELECT c FROM Cazari c WHERE c.nrcamere = :nrcamere"),
    @NamedQuery(name = "Cazari.findByCodidentificare", query = "SELECT c FROM Cazari c WHERE c.codidentificare = :codidentificare")})
public class Cazari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numelocatie")
    private String numelocatie;
    @Basic(optional = false)
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "tipcazare")
    private String tipcazare;
    @Column(name = "nrcamere")
    private Integer nrcamere;
    @Basic(optional = false)
    @Column(name = "codidentificare")
    private String codidentificare;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId")
    private Collection<Rooms> roomsCollection;

    public Cazari() {
    }

    public Cazari(Integer id) {
        this.id = id;
    }

    public Cazari(Integer id, String numelocatie, String adresa, String codidentificare) {
        this.id = id;
        this.numelocatie = numelocatie;
        this.adresa = adresa;
        this.codidentificare = codidentificare;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumelocatie() {
        return numelocatie;
    }

    public void setNumelocatie(String numelocatie) {
        this.numelocatie = numelocatie;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTipcazare() {
        return tipcazare;
    }

    public void setTipcazare(String tipcazare) {
        this.tipcazare = tipcazare;
    }

    public Integer getNrcamere() {
        return nrcamere;
    }

    public void setNrcamere(Integer nrcamere) {
        this.nrcamere = nrcamere;
    }

    public String getCodidentificare() {
        return codidentificare;
    }

    public void setCodidentificare(String codidentificare) {
        this.codidentificare = codidentificare;
    }

    public Collection<Rooms> getRoomsCollection() {
        return roomsCollection;
    }

    public void setRoomsCollection(Collection<Rooms> roomsCollection) {
        this.roomsCollection = roomsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cazari)) {
            return false;
        }
        Cazari other = (Cazari) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Cazari[ id=" + id + " ]";
    }
    
}
