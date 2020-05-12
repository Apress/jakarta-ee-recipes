
package org.jakartaeerecipes.chapter10.recipe10_04;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Email;

/**
 *
 * @author Juneau
 */
@Named
@RequestScoped
public class ParameterValidationController {
    
   
    private String email;
    
    
    public void submit(){
        submitEmailAddress(email);
    }
    
    public void submitEmailAddress(@Email String emailAddress){
        System.out.println("Do something with the address: " + emailAddress);
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
