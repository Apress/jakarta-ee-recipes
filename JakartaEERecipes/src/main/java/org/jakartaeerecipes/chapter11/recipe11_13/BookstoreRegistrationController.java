
package org.jakartaeerecipes.chapter11.recipe11_13;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Juneau
 */
@Named
@Dependent
public class BookstoreRegistrationController implements BookstoreRegistration, Serializable {
    
    @Inject
    private Registration current;
    
    public BookstoreRegistrationController(){
        
    }

    /**
     * @return the current
     */
    public Registration getCurrent() {
        if(current == null){
            current = new Registration();
        }
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(Registration current) {
        this.current = current;
    }
    
    public String register(){
        System.out.println("Executing Registration");
        return register(current);
    }

    @Override
    public String register(Registration registration) {
        // Persist current registration
        return null;
    }
    
    
}
