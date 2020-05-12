package org.jakartaeerecipes.chapter06.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Chapter 6
 * Entity class for the BOOK_AUTHOR database table of the Acme Bookstore application
 * @author juneau
 */
@Entity
@Table(name = "BOOK_AUTHOR")
@NamedQueries({
    @NamedQuery(name = "BookAuthor06.findAll", query = "SELECT b FROM BookAuthor06 b"),
    @NamedQuery(name = "BookAuthor06.findById", query = "SELECT b FROM BookAuthor06 b WHERE b.id = :id"),
    @NamedQuery(name = "BookAuthor06.findByLast", query = "SELECT b FROM BookAuthor06 b WHERE b.last = :last"),
    @NamedQuery(name = "BookAuthor06.findByFirst", query = "SELECT b FROM BookAuthor06 b WHERE b.first = :first")})
public class BookAuthor06 implements Serializable {
   
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name="book_author_s_generator",sequenceName="book_author_s", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
    generator="book_author_s_generator")
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 30)
    @Column(name = "LASTNAME")
    private String last;
    @Size(max = 30)
    @Column(name = "FIRSTNAME")
    private String first;
    @Lob
    @Column(name = "BIO")
    private String bio;

    public BookAuthor06() {
    }

    public BookAuthor06(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
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
        if (!(object instanceof BookAuthor06)) {
            return false;
        }
        BookAuthor06 other = (BookAuthor06) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jakartaeerecipes.chapter06.entity.BookAuthor06[ id=" + id + " ]";
    }

   
   
    
}
