
package org.jakartaeerecipes.chapter08.session;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 * Chapter 8 - Asynchronous Session Bean
 * @author juneau
 */
@Stateless
public class AsyncBeanExample {
    
    @Asynchronous
    public void asyncMethodCall(){
        // Do Something
        System.out.println("This method is occurring asynchronously...");
    }
    
    
    
}
