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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "rooms")
@NamedQueries({
    @NamedQuery(name = "Rooms.findAll", query = "SELECT r FROM Rooms r"),
    @NamedQuery(name = "Rooms.findByRoomId", query = "SELECT r FROM Rooms r WHERE r.roomId = :roomId"),
    @NamedQuery(name = "Rooms.findByRoomNumber", query = "SELECT r FROM Rooms r WHERE r.roomNumber = :roomNumber"),
    @NamedQuery(name = "Rooms.findByRoomType", query = "SELECT r FROM Rooms r WHERE r.roomType = :roomType"),
    @NamedQuery(name = "Rooms.findByCapacity", query = "SELECT r FROM Rooms r WHERE r.capacity = :capacity"),
    @NamedQuery(name = "Rooms.findByStatus", query = "SELECT r FROM Rooms r WHERE r.status = :status")})
public class Rooms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "room_id")
    private Integer roomId;
    @Basic(optional = false)
    @Column(name = "room_number")
    private String roomNumber;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "status")
    private String status;
    @ManyToMany(mappedBy = "roomsCollection")
    private Collection<Amenities> amenitiesCollection;
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cazari accountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<Feedback> feedbackCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<MaintenanceLogs> maintenanceLogsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<Reviews> reviewsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<AccessRoom> accessRoomCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<RoomAccessCards> roomAccessCardsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<RoomServices> roomServicesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<Reservations> reservationsCollection;

    public Rooms() {
    }

    public Rooms(Integer roomId) {
        this.roomId = roomId;
    }

    public Rooms(Integer roomId, String roomNumber) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection<Amenities> getAmenitiesCollection() {
        return amenitiesCollection;
    }

    public void setAmenitiesCollection(Collection<Amenities> amenitiesCollection) {
        this.amenitiesCollection = amenitiesCollection;
    }

    public Cazari getAccountId() {
        return accountId;
    }

    public void setAccountId(Cazari accountId) {
        this.accountId = accountId;
    }

    public Collection<Feedback> getFeedbackCollection() {
        return feedbackCollection;
    }

    public void setFeedbackCollection(Collection<Feedback> feedbackCollection) {
        this.feedbackCollection = feedbackCollection;
    }

    public Collection<MaintenanceLogs> getMaintenanceLogsCollection() {
        return maintenanceLogsCollection;
    }

    public void setMaintenanceLogsCollection(Collection<MaintenanceLogs> maintenanceLogsCollection) {
        this.maintenanceLogsCollection = maintenanceLogsCollection;
    }

    public Collection<Reviews> getReviewsCollection() {
        return reviewsCollection;
    }

    public void setReviewsCollection(Collection<Reviews> reviewsCollection) {
        this.reviewsCollection = reviewsCollection;
    }

    public Collection<AccessRoom> getAccessRoomCollection() {
        return accessRoomCollection;
    }

    public void setAccessRoomCollection(Collection<AccessRoom> accessRoomCollection) {
        this.accessRoomCollection = accessRoomCollection;
    }

    public Collection<RoomAccessCards> getRoomAccessCardsCollection() {
        return roomAccessCardsCollection;
    }

    public void setRoomAccessCardsCollection(Collection<RoomAccessCards> roomAccessCardsCollection) {
        this.roomAccessCardsCollection = roomAccessCardsCollection;
    }

    public Collection<RoomServices> getRoomServicesCollection() {
        return roomServicesCollection;
    }

    public void setRoomServicesCollection(Collection<RoomServices> roomServicesCollection) {
        this.roomServicesCollection = roomServicesCollection;
    }

    public Collection<Reservations> getReservationsCollection() {
        return reservationsCollection;
    }

    public void setReservationsCollection(Collection<Reservations> reservationsCollection) {
        this.reservationsCollection = reservationsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomId != null ? roomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rooms)) {
            return false;
        }
        Rooms other = (Rooms) object;
        if ((this.roomId == null && other.roomId != null) || (this.roomId != null && !this.roomId.equals(other.roomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Rooms[ roomId=" + roomId + " ]";
    }
    
}
