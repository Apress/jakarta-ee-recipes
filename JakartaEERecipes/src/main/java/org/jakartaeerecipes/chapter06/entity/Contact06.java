
package org.javaee8recipes.chapter08.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Chapter 6
 * Entity class for the CONTACT database table
 * @author juneau
 */
@Entity
@Table(name = "CONTACT")
@NamedQueries({
    @NamedQuery(name = "Contact06.findAll", query = "SELECT c FROM Contact06  c"),
    @NamedQuery(name = "Contact06.findById", query = "SELECT c FROM Contact06 c WHERE c.id = :id"),
    @NamedQuery(name = "Contact06.findByFirst", query = "SELECT c FROM Contact06 c WHERE c.first = :first"),
    @NamedQuery(name = "Contact06.findByLast", query = "SELECT c FROM Contact06 c WHERE c.last = :last"),
    @NamedQuery(name = "Contact06.findByEmail", query = "SELECT c FROM Contact06 c WHERE c.email = :email"),
    @NamedQuery(name = "Contact06.findByPassword", query = "SELECT c FROM Contact06 c WHERE c.password = :password"),
    @NamedQuery(name = "Contact06.findByOccupation", query = "SELECT c FROM Contact06 c WHERE c.occupation = :occupation"),
    @NamedQuery(name = "Contact06.findByReceivenotifications", query = "SELECT c FROM Contact06 c WHERE c.receivenotifications = :receivenotifications"),
    @NamedQuery(name = "Contact06.findByGender", query = "SELECT c FROM Contact06 c WHERE c.gender = :gender")})
public class Contact06 implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 50)
    @Column(name = "FIRSTNAME")
    private String first;
    @Size(max = 50)
    @Column(name = "LASTNAME")
    private String last;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 150)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 30)
    @Column(name = "PASSWORD")
    private String password;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 150)
    @Column(name = "OCCUPATION")
    private String occupation;
    @Size(max = 1)
    @Column(name = "RECEIVENOTIFICATIONS")
    private String receivenotifications;
    @Size(max = 1)
    @Column(name = "GENDER")
    private String gender;

    public Contact06() {
    }

    public Contact06(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getReceivenotifications() {
        return receivenotifications;
    }

    public void setReceivenotifications(String receivenotifications) {
        this.receivenotifications = receivenotifications;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        if (!(object instanceof Contact06)) {
            return false;
        }
        Contact06 other = (Contact06) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jakartaeerecipes.chapter06.entity.Contact06[ id=" + id + " ]";
    }
    
}
