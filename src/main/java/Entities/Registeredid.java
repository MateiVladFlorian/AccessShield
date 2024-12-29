/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "registeredid")
@NamedQueries({
    @NamedQuery(name = "Registeredid.findAll", query = "SELECT r FROM Registeredid r"),
    @NamedQuery(name = "Registeredid.findById", query = "SELECT r FROM Registeredid r WHERE r.id = :id"),
    @NamedQuery(name = "Registeredid.findByAccountId", query = "SELECT r FROM Registeredid r WHERE r.accountId = :accountId"),
    @NamedQuery(name = "Registeredid.findByFeedbackId", query = "SELECT r FROM Registeredid r WHERE r.feedbackId = :feedbackId"),
    @NamedQuery(name = "Registeredid.findByRoomsId", query = "SELECT r FROM Registeredid r WHERE r.roomsId = :roomsId"),
    @NamedQuery(name = "Registeredid.findByPaymentsId", query = "SELECT r FROM Registeredid r WHERE r.paymentsId = :paymentsId"),
    @NamedQuery(name = "Registeredid.findByReservationsId", query = "SELECT r FROM Registeredid r WHERE r.reservationsId = :reservationsId"),
    @NamedQuery(name = "Registeredid.findByBillingInfoId", query = "SELECT r FROM Registeredid r WHERE r.billingInfoId = :billingInfoId"),
    @NamedQuery(name = "Registeredid.findByRoomAccessCardsId", query = "SELECT r FROM Registeredid r WHERE r.roomAccessCardsId = :roomAccessCardsId"),
    @NamedQuery(name = "Registeredid.findByBiometricDataId", query = "SELECT r FROM Registeredid r WHERE r.biometricDataId = :biometricDataId"),
    @NamedQuery(name = "Registeredid.findByPaymentGatewaysId", query = "SELECT r FROM Registeredid r WHERE r.paymentGatewaysId = :paymentGatewaysId"),
    @NamedQuery(name = "Registeredid.findByCreatedAt", query = "SELECT r FROM Registeredid r WHERE r.createdAt = :createdAt")})
public class Registeredid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "account_id")
    private int accountId;
    @Basic(optional = false)
    @Column(name = "feedback_id")
    private int feedbackId;
    @Basic(optional = false)
    @Column(name = "rooms_id")
    private int roomsId;
    @Basic(optional = false)
    @Column(name = "payments_id")
    private int paymentsId;
    @Basic(optional = false)
    @Column(name = "reservations_id")
    private int reservationsId;
    @Basic(optional = false)
    @Column(name = "billing_info_id")
    private int billingInfoId;
    @Basic(optional = false)
    @Column(name = "room_access_cards_id")
    private int roomAccessCardsId;
    @Basic(optional = false)
    @Column(name = "biometric_data_id")
    private int biometricDataId;
    @Basic(optional = false)
    @Column(name = "payment_gateways_id")
    private int paymentGatewaysId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public Registeredid() {
    }

    public Registeredid(Integer id) {
        this.id = id;
    }

    public Registeredid(Integer id, int accountId, int feedbackId, int roomsId, int paymentsId, int reservationsId, int billingInfoId, int roomAccessCardsId, int biometricDataId, int paymentGatewaysId) {
        this.id = id;
        this.accountId = accountId;
        this.feedbackId = feedbackId;
        this.roomsId = roomsId;
        this.paymentsId = paymentsId;
        this.reservationsId = reservationsId;
        this.billingInfoId = billingInfoId;
        this.roomAccessCardsId = roomAccessCardsId;
        this.biometricDataId = biometricDataId;
        this.paymentGatewaysId = paymentGatewaysId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(int roomsId) {
        this.roomsId = roomsId;
    }

    public int getPaymentsId() {
        return paymentsId;
    }

    public void setPaymentsId(int paymentsId) {
        this.paymentsId = paymentsId;
    }

    public int getReservationsId() {
        return reservationsId;
    }

    public void setReservationsId(int reservationsId) {
        this.reservationsId = reservationsId;
    }

    public int getBillingInfoId() {
        return billingInfoId;
    }

    public void setBillingInfoId(int billingInfoId) {
        this.billingInfoId = billingInfoId;
    }

    public int getRoomAccessCardsId() {
        return roomAccessCardsId;
    }

    public void setRoomAccessCardsId(int roomAccessCardsId) {
        this.roomAccessCardsId = roomAccessCardsId;
    }

    public int getBiometricDataId() {
        return biometricDataId;
    }

    public void setBiometricDataId(int biometricDataId) {
        this.biometricDataId = biometricDataId;
    }

    public int getPaymentGatewaysId() {
        return paymentGatewaysId;
    }

    public void setPaymentGatewaysId(int paymentGatewaysId) {
        this.paymentGatewaysId = paymentGatewaysId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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
        if (!(object instanceof Registeredid)) {
            return false;
        }
        Registeredid other = (Registeredid) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Registeredid[ id=" + id + " ]";
    }
    
}
