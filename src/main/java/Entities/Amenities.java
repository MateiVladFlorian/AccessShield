/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "amenities")
@NamedQueries({
    @NamedQuery(name = "Amenities.findAll", query = "SELECT a FROM Amenities a"),
    @NamedQuery(name = "Amenities.findByAmenityId", query = "SELECT a FROM Amenities a WHERE a.amenityId = :amenityId"),
    @NamedQuery(name = "Amenities.findByAmenityName", query = "SELECT a FROM Amenities a WHERE a.amenityName = :amenityName"),
    @NamedQuery(name = "Amenities.findByDescription", query = "SELECT a FROM Amenities a WHERE a.description = :description")})
public class Amenities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "amenity_id")
    private Integer amenityId;
    @Basic(optional = false)
    @Column(name = "amenity_name")
    private String amenityName;
    @Column(name = "description")
    private String description;
    @JoinTable(name = "room_amenities", joinColumns = {
        @JoinColumn(name = "amenity_id", referencedColumnName = "amenity_id")}, inverseJoinColumns = {
        @JoinColumn(name = "room_id", referencedColumnName = "room_id")})
    @ManyToMany
    private Collection<Rooms> roomsCollection;

    public Amenities() {
    }

    public Amenities(Integer amenityId) {
        this.amenityId = amenityId;
    }

    public Amenities(Integer amenityId, String amenityName) {
        this.amenityId = amenityId;
        this.amenityName = amenityName;
    }

    public Integer getAmenityId() {
        return amenityId;
    }

    public void setAmenityId(Integer amenityId) {
        this.amenityId = amenityId;
    }

    public String getAmenityName() {
        return amenityName;
    }

    public void setAmenityName(String amenityName) {
        this.amenityName = amenityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (amenityId != null ? amenityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Amenities)) {
            return false;
        }
        Amenities other = (Amenities) object;
        if ((this.amenityId == null && other.amenityId != null) || (this.amenityId != null && !this.amenityId.equals(other.amenityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Amenities[ amenityId=" + amenityId + " ]";
    }
    
}
