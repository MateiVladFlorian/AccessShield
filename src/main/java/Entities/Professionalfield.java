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
@Table(name = "professionalfield")
@NamedQueries({
    @NamedQuery(name = "Professionalfield.findAll", query = "SELECT p FROM Professionalfield p"),
    @NamedQuery(name = "Professionalfield.findById", query = "SELECT p FROM Professionalfield p WHERE p.id = :id"),
    @NamedQuery(name = "Professionalfield.findByProfessionalname", query = "SELECT p FROM Professionalfield p WHERE p.professionalname = :professionalname"),
    @NamedQuery(name = "Professionalfield.findByCodidentificare", query = "SELECT p FROM Professionalfield p WHERE p.codidentificare = :codidentificare")})
public class Professionalfield implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "professionalname")
    private String professionalname;
    @Basic(optional = false)
    @Column(name = "codidentificare")
    private String codidentificare;
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Account accountId;

    public Professionalfield() {
    }

    public Professionalfield(Integer id) {
        this.id = id;
    }

    public Professionalfield(Integer id, String codidentificare) {
        this.id = id;
        this.codidentificare = codidentificare;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfessionalname() {
        return professionalname;
    }

    public void setProfessionalname(String professionalname) {
        this.professionalname = professionalname;
    }

    public String getCodidentificare() {
        return codidentificare;
    }

    public void setCodidentificare(String codidentificare) {
        this.codidentificare = codidentificare;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
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
        if (!(object instanceof Professionalfield)) {
            return false;
        }
        Professionalfield other = (Professionalfield) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Professionalfield[ id=" + id + " ]";
    }
    
}
