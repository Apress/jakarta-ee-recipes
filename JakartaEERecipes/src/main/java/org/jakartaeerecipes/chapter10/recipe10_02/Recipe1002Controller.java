/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.chapter10.recipe10_02;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.jakartaeerecipes.chapter08.session.BookFacade;
import org.jakartaeerecipes.entity.Book;

/**
 *
 * @author Juneau
 */
@Named(value="recipe1002Controller")
@ViewScoped
public class Recipe1002Controller implements java.io.Serializable {
    
    @EJB
    BookFacade bookFacade;
    
    private Book current;
    
    public void addBook(){
        System.out.println("Add book to database here");
        
        bookFacade.create(current);
            
    }

    /**
     * @return the current
     */
    public Book getCurrent() {
        if(current == null){
            current = new Book();
        }
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(Book current) {
        this.current = current;
    }
}
