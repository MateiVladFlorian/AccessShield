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
@Table(name = "access_devices")
@NamedQueries({
    @NamedQuery(name = "AccessDevices.findAll", query = "SELECT a FROM AccessDevices a"),
    @NamedQuery(name = "AccessDevices.findByDeviceId", query = "SELECT a FROM AccessDevices a WHERE a.deviceId = :deviceId"),
    @NamedQuery(name = "AccessDevices.findByDeviceType", query = "SELECT a FROM AccessDevices a WHERE a.deviceType = :deviceType"),
    @NamedQuery(name = "AccessDevices.findByLocation", query = "SELECT a FROM AccessDevices a WHERE a.location = :location"),
    @NamedQuery(name = "AccessDevices.findByStatus", query = "SELECT a FROM AccessDevices a WHERE a.status = :status"),
    @NamedQuery(name = "AccessDevices.findByInstallationDate", query = "SELECT a FROM AccessDevices a WHERE a.installationDate = :installationDate"),
    @NamedQuery(name = "AccessDevices.findByLastMaintenance", query = "SELECT a FROM AccessDevices a WHERE a.lastMaintenance = :lastMaintenance")})
public class AccessDevices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "device_id")
    private Integer deviceId;
    @Basic(optional = false)
    @Column(name = "device_type")
    private String deviceType;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "installation_date")
    @Temporal(TemporalType.DATE)
    private Date installationDate;
    @Column(name = "last_maintenance")
    @Temporal(TemporalType.DATE)
    private Date lastMaintenance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<AccessLogs> accessLogsCollection;
    @JoinColumn(name = "biometric_id", referencedColumnName = "biometric_id")
    @ManyToOne(optional = false)
    private BiometricData biometricId;

    public AccessDevices() {
    }

    public AccessDevices(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public AccessDevices(Integer deviceId, String deviceType, String location, String status, Date installationDate) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.location = location;
        this.status = status;
        this.installationDate = installationDate;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }

    public Date getLastMaintenance() {
        return lastMaintenance;
    }

    public void setLastMaintenance(Date lastMaintenance) {
        this.lastMaintenance = lastMaintenance;
    }

    public Collection<AccessLogs> getAccessLogsCollection() {
        return accessLogsCollection;
    }

    public void setAccessLogsCollection(Collection<AccessLogs> accessLogsCollection) {
        this.accessLogsCollection = accessLogsCollection;
    }

    public BiometricData getBiometricId() {
        return biometricId;
    }

    public void setBiometricId(BiometricData biometricId) {
        this.biometricId = biometricId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deviceId != null ? deviceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessDevices)) {
            return false;
        }
        AccessDevices other = (AccessDevices) object;
        if ((this.deviceId == null && other.deviceId != null) || (this.deviceId != null && !this.deviceId.equals(other.deviceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.AccessDevices[ deviceId=" + deviceId + " ]";
    }
    
}
