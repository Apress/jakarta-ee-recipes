/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.chapter15.recipe15_02;

import java.io.Serializable;
import javax.annotation.security.DeclareRoles;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author juneau
 */
@Named("recipe15_02")
@SessionScoped
@DeclareRoles("users")
public class Recipe15_02 implements Serializable {

    /**
     * Creates a new instance of Recipe17_02
     */
    public Recipe15_02() {
    }
    
    public String nextPage(){
        return "recipe15_02b.xhtml";
    }
}
