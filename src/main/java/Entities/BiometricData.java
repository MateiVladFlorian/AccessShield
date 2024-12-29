/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "biometric_data")
@NamedQueries({
    @NamedQuery(name = "BiometricData.findAll", query = "SELECT b FROM BiometricData b"),
    @NamedQuery(name = "BiometricData.findByBiometricId", query = "SELECT b FROM BiometricData b WHERE b.biometricId = :biometricId"),
    @NamedQuery(name = "BiometricData.findByBiometricType", query = "SELECT b FROM BiometricData b WHERE b.biometricType = :biometricType"),
    @NamedQuery(name = "BiometricData.findByBiometricValue", query = "SELECT b FROM BiometricData b WHERE b.biometricValue = :biometricValue"),
    @NamedQuery(name = "BiometricData.findByEnrollmentDate", query = "SELECT b FROM BiometricData b WHERE b.enrollmentDate = :enrollmentDate"),
    @NamedQuery(name = "BiometricData.findByStatus", query = "SELECT b FROM BiometricData b WHERE b.status = :status")})
public class BiometricData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "biometric_id")
    private Integer biometricId;
    @Basic(optional = false)
    @Column(name = "biometric_type")
    private String biometricType;
    @Basic(optional = false)
    @Column(name = "biometric_value")
    private String biometricValue;
    @Basic(optional = false)
    @Column(name = "enrollment_date")
    @Temporal(TemporalType.DATE)
    private Date enrollmentDate;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @ManyToOne
    private Account accountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "biometricId")
    private Collection<AccessDevices> accessDevicesCollection;

    public BiometricData() {
    }

    public BiometricData(Integer biometricId) {
        this.biometricId = biometricId;
    }

    public BiometricData(Integer biometricId, String biometricType, String biometricValue, Date enrollmentDate, String status) {
        this.biometricId = biometricId;
        this.biometricType = biometricType;
        this.biometricValue = biometricValue;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public Integer getBiometricId() {
        return biometricId;
    }

    public void setBiometricId(Integer biometricId) {
        this.biometricId = biometricId;
    }

    public String getBiometricType() {
        return biometricType;
    }

    public void setBiometricType(String biometricType) {
        this.biometricType = biometricType;
    }

    public String getBiometricValue() {
        return biometricValue;
    }

    public void setBiometricValue(String biometricValue) {
        this.biometricValue = biometricValue;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Collection<AccessDevices> getAccessDevicesCollection() {
        return accessDevicesCollection;
    }

    public void setAccessDevicesCollection(Collection<AccessDevices> accessDevicesCollection) {
        this.accessDevicesCollection = accessDevicesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (biometricId != null ? biometricId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BiometricData)) {
            return false;
        }
        BiometricData other = (BiometricData) object;
        if ((this.biometricId == null && other.biometricId != null) || (this.biometricId != null && !this.biometricId.equals(other.biometricId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.BiometricData[ biometricId=" + biometricId + " ]";
    }
    
}
