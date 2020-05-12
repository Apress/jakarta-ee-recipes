
package org.jakartaeerecipes.chapter11.observer;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.jakartaeerecipes.chapter08.jsf.BookController;
import org.jakartaeerecipes.chapter11.event.BookEvent;
import org.jakartaeerecipes.chapter11.qualifier.OnlineSale;
import org.jakartaeerecipes.chapter11.qualifier.StoreSale;

/**
 *
 * @author Juneau
 */
public class BookEventHandler {
    
    @Inject
    private BookController bookController;
    
    public BookEventHandler(){
        
    }
    
    public void notifyPublisherOnline (@Observes @OnlineSale BookEvent event) {
        for (String s : event.getNotifyList()) {
            System.out.println("Sending Notification to Pubisher: " + s + " purchase of book online: "
                    + bookController.findById(event.getBook()).getTitle() + " from store: " + event.getStoreName()
                    + " purchase price: $" + event.getPrice()
                    + " on: " + event.getDate());
        }
    }
    
    public void notifyPublisherInStore (@Observes @StoreSale BookEvent event) {
        for (String s : event.getNotifyList()) {
            System.out.println("Sending Notification to Pubisher: " + s + " purchase of book in store: "
                    + bookController.findById(event.getBook()).getTitle() + " from store: " + event.getStoreName()
                    + " purchase price: $" + event.getPrice()
                    + " on: " + event.getDate());
        }
    }
}
