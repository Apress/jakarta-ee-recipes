package org.jakartaeerecipes.chapter06.recipe06_06;

import org.jakartaeerecipes.chapter06.entity.BookAuthor06;
import org.jakartaeerecipes.chapter06.recipe06_06.AuthorDetail06;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Chapter 8 Demonstration for a one-to-one entity relationship
 *
 * @author juneau
 */
@Entity
@Table(name = "AUTHOR")
public class Author06 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "author_s_generator", sequenceName = "author_s", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "author_s_generator")
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 30)
    @Column(name = "LAST")
    private String last;
    @Size(max = 30)
    @Column(name = "FIRST")
    private String first;
    @Lob
    @Column(name = "BIO")
    private String bio;
    @OneToOne
    private AuthorDetail06 authorDetail;

    public Author06() {
    }

    public Author06(BigDecimal id) {
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
        Author06 other = (Author06) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.javaeerecipes.chapter08.entity.recipe08_06.Author08[ id=" + id + " ]";
    }

    /**
     * @return the authorId
     */
    public org.jakartaeerecipes.chapter06.recipe06_06.AuthorDetail06 getAuthorDetail() {
        return authorDetail;
    }

    /**
     * @param authorId the authorId to set
     */
    public void setAuthorDetail(org.jakartaeerecipes.chapter06.recipe06_06.AuthorDetail06 authorDetail) {
        this.authorDetail = authorDetail;
    }
}
