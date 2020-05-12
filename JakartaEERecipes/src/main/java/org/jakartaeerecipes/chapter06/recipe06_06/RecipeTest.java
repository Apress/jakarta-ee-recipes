package org.jakartaeerecipes.chapter06.recipe06_06;

import java.util.Iterator;
import java.util.List;
import javax.persistence.*;

/**
 * Recipe 6-6: Persistence Unit Teat
 *
 * @author juneau
 */
public class RecipeTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JakartaEERecipesLOCAL");
        EntityManager em = emf.createEntityManager();
        try {
            EntityTransaction entr = em.getTransaction();
            entr.begin();
            Author06 author = new Author06();
            author.setFirst("JOE");
            author.setLast("TESTER");
            author.setBio("An author test account.");
            AuthorDetail06 detail = new AuthorDetail06();
            detail.setAddress1("Address 1");
            detail.setAddress2("Address 2");
            detail.setCity("NoMansLand");
            detail.setState("ZZ");
            detail.setZip("12345");
            detail.setNotes("This is a test detail");
            author.setAuthorDetail(detail);
            em.persist(author);
            em.getTransaction().commit();
        } catch (Exception ex){
            System.err.println(ex);
        }
    }
}
