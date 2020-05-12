
package org.jakartaeerecipes.chapter11.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import org.jakartaeerecipes.chapter11.recipe11_13.BookstoreRegistration;
import org.jakartaeerecipes.chapter11.recipe11_13.Registration;

/**
 *
 * @author Juneau
 */
@Decorator
public abstract class RegistrationDecorator implements BookstoreRegistration {
    
    @Inject
    @Delegate
    @Any
    private BookstoreRegistration registration;
    
    @Override
    public String register(Registration registration){
        // Submit to registration database table
        // Submit to promotional database table
        return registration.getEmail() + " has been entered into the giveaway";
    }
}
