/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author vlad
 */
@Entity
@Table(name = "staff_roles")
@NamedQueries({
    @NamedQuery(name = "StaffRoles.findAll", query = "SELECT s FROM StaffRoles s"),
    @NamedQuery(name = "StaffRoles.findByRoleId", query = "SELECT s FROM StaffRoles s WHERE s.roleId = :roleId"),
    @NamedQuery(name = "StaffRoles.findByRoleName", query = "SELECT s FROM StaffRoles s WHERE s.roleName = :roleName"),
    @NamedQuery(name = "StaffRoles.findByDescription", query = "SELECT s FROM StaffRoles s WHERE s.description = :description")})
public class StaffRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_id")
    private Integer roleId;
    @Basic(optional = false)
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "staff_id", referencedColumnName = "staff_id")
    @ManyToOne(optional = false)
    private Staff staffId;

    public StaffRoles() {
    }

    public StaffRoles(Integer roleId) {
        this.roleId = roleId;
    }

    public StaffRoles(Integer roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Staff getStaffId() {
        return staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaffRoles)) {
            return false;
        }
        StaffRoles other = (StaffRoles) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.StaffRoles[ roleId=" + roleId + " ]";
    }
    
}
