
package org.jakartaeerecipes.chapter08.local;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Local;
import org.jakartaeerecipes.entity.AuthorWork;
import org.jakartaeerecipes.entity.Book;
import org.jakartaeerecipes.entity.BookAuthor;

/**
 * Local business interface for the AuthorWorkFacade stateless session bean
 * @author juneau
 */
// Comment this annotation to decorate the EJB itself with the annotation
@Local
public interface AuthorWorkType {
    public List<AuthorWork> performFind(BigDecimal bookId);
    
    public List<AuthorWork> performFindByAuthor(BookAuthor authorId);
    
    public Long findAuthorCount(Book book);
}
