
package org.jakartaeerecipes.chapter11.recipe11_11;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.jakartaeerecipes.chapter11.interceptor.Notified;

/**
 *
 * @author Juneau
 */
@Notified
@Named
@RequestScoped
public class AdminConsoleController {
    
    public AdminConsoleController(){
        
    }
    
    public void login(){
        System.out.println("This is an action method which would allow one to log into an"
                + "administrative console");
    }
    
}
