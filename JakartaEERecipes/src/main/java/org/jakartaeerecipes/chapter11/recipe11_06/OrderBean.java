

package org.jakartaeerecipes.chapter11.recipe11_06;

import java.util.List;
import org.jakartaeerecipes.entity.Book;


/**
 * Recipe 11-6 - @Veto Annotation
 * @author Juneau
 */

//@Veto
public class OrderBean implements java.io.Serializable {
    
   // @Produces @Disposer
    List<Book> books;
    
    public OrderBean(){
        
    }
    
    // Some Class Implementation
}
