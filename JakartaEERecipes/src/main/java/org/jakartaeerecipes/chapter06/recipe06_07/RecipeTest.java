package org.jakartaeerecipes.chapter06.recipe06_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

/**
 * Recipe 6-7: Persistence Unit Teat
 *
 * @author juneau
 */
public class RecipeTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JakartaEERecipesLOCAL");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Author author = new Author();
            author.setFirst("JOE");
            author.setLast("TESTER");
            author.setBio("An author test account.");
            Set detailSet = new HashSet<AuthorDetail>();
            AuthorDetail detail = new AuthorDetail();
            detail.setAddress1("Address 1");
            detail.setAddress2("Address 2");
            detail.setCity("NoMansLand");
            detail.setState("ZZ");
            detail.setZip("12345");
            detail.setNotes("This is a test detail");
            detailSet.add(detail);
            AuthorDetail detail2 = new AuthorDetail();
            detail.setAddress1("Address 1");
            detail.setAddress2("Address 2");
            detail.setCity("NoMansLand");
            detail.setState("ZZ");
            detail.setZip("12345");
            detail.setNotes("This is a test detail");
            detailSet.add(detail2);
            em.persist(author);
            em.getTransaction().commit();
        } catch (Exception ex){
            System.err.println(ex);
        } finally{
            if (em != null){
                em.close();
            }
        }
    }
}
