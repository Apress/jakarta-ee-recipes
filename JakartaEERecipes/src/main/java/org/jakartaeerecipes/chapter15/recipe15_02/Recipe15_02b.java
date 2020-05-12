/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.chapter15.recipe15_02;

import java.io.Serializable;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author juneau
 */
@Named("recipe15_02b")
@SessionScoped

public class Recipe15_02b implements Serializable {

    /**
     * Creates a new instance of Recipe17_02
     */
    public Recipe15_02b() {
    }
    
    public String unsecuredProcess(){
        return "recipe15_02_1.xhtml";
    }
    
    @RolesAllowed("users")
    public String securedProcess(){
        return "recipe15_02_2.xhtml";
    }
}
