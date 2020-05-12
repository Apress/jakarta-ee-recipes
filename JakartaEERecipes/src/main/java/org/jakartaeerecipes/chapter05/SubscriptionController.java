
package org.jakartaeerecipes.chapter05;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.jakartaeerecipes.chapter05.dao.ContactDAO;

/**
 * Chapter 5
 * @author juneau
 * 
 * Session-scoped bean that is used to hold the list of subscribers.  Uses an
 * ArrayList in the early book chapters, but will evolve to make use of a database
 * later in the book.
 */
@SessionScoped
@Named("ch5SubscriptionController")
public class SubscriptionController implements Serializable {
    
    private List <Contact> subscriptionList;
    private ContactDAO contactDao = new ContactDAO();

    /**
     * Creates a new instance of SubscriptionController
     */
    public SubscriptionController() {
        subscriptionList = contactDao.queryContacts();
    }

    /**
     * @return the subscriptionList
     */
    public List <Contact> getSubscriptionList() {
        subscriptionList = contactDao.queryContacts();
        return subscriptionList;
    }

    /**
     * @param subscriptionList the subscriptionList to set
     */
    public void setSubscriptionList(List <Contact> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }
}
