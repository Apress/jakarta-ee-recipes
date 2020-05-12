/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.chapter08.jsf;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.jakartaeerecipes.entity.Contact;
import org.jakartaeerecipes.chapter08.session.ContactFacade;


/**
 *
 * @author juneau
 */
@Named(value = "subscriptionController1")
@SessionScoped
public class SubscriptionController implements Serializable {

    private List <Contact> subscriptionList;
    
    
    @EJB
    private ContactFacade contactFacade;
    /**
     * Creates a new instance of SubscriptionController
     */
    public SubscriptionController() {
        subscriptionList = contactFacade.findAll();
    }

    /**
     * @return the subscriptionList
     */
    public List <Contact> getSubscriptionList() {
        subscriptionList = contactFacade.findAll();
        return subscriptionList;
    }

    /**
     * @param subscriptionList the subscriptionList to set
     */
    public void setSubscriptionList(List <Contact> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }
}
