package org.jakartaeerecipes.chapter06.recipe06_09;

import java.util.Iterator;
import java.util.List;
import javax.persistence.*;
import org.jakartaeerecipes.chapter06.entity.BookAuthor06;

/**
 * Recipe 6-9:  Named Queries
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
            Query query = em.createNamedQuery("BookAuthor.findAll");
            List authorList = query.getResultList();
            Iterator authorIterator = authorList.iterator();
            while (authorIterator.hasNext()) {
                BookAuthor06 author = (BookAuthor06) authorIterator.next();
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
