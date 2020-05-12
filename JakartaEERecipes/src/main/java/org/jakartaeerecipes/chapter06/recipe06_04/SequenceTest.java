package org.jakartaeerecipes.chapter06.recipe06_04;

import java.util.Iterator;
import java.util.List;
import javax.persistence.*;
import org.jakartaeerecipes.chapter06.entity.BookAuthor06;

/**
 * Recipe 6-4: Persistence Unit Test
 *
 * @author juneau
 */
public class SequenceTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JakartaEERecipesLOCAL");
        EntityManager em = emf.createEntityManager();
        try {
            EntityTransaction entr = em.getTransaction();
            entr.begin();
            BookAuthor06 author = new BookAuthor06();
            author.setFirst("JOE");
            author.setLast("TESTER");
            author.setBio("An author test account.");
            boolean successful = false;
            try {
                em.persist(author);
                successful = true;
            } finally {
                if (successful){
                    entr.commit();
                } else {
                    entr.rollback();
                }
            } 
           
            Query query = em.createNamedQuery("BookAuthor06.findAll");
            List authorList = query.getResultList();
            Iterator authorIterator = authorList.iterator();
            while (authorIterator.hasNext()) {
                author = (BookAuthor06) authorIterator.next();
                System.out.print("Name:" + author.getFirst() + " " + author.getLast());
                System.out.println();
            }
        } catch (Exception ex){
            System.err.println(ex);
        } finally {
            if (em != null){
                em.close();
            }
        }
    }
}
