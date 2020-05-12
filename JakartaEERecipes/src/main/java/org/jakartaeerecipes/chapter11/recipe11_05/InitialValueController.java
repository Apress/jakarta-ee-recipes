
package org.jakartaeerecipes.chapter11.recipe11_05;

import javax.enterprise.inject.Produces;

/**
 * Recipe 11-5:  Producer Fields and Methods
 * @author juneau
 */

public class InitialValueController implements java.io.Serializable {
    
       @Produces @InitValue public int initialValue = 1000;
       
       
}