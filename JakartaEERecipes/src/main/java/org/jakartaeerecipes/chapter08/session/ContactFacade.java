/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.chapter08.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.jakartaeerecipes.entity.Contact;

/**
 *
 * @author juneau
 */
@Stateless
public class ContactFacade extends AbstractFacade<Contact> {
    @PersistenceContext(unitName = "JakartaEERecipesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactFacade() {
        super(Contact.class);
    }
    
    
    
}
