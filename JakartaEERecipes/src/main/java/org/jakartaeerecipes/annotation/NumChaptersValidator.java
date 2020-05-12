/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.jakartaeerecipes.entity.Book;

/**
 *
 * @author Juneau
 */
public class NumChaptersValidator implements ConstraintValidator<ValidNumChapters, Book> {
    
    @Override
    public void initialize(ValidNumChapters constraintAnnotation) {
        
    }

    @Override
    public boolean isValid(Book book, ConstraintValidatorContext cvc) {
        if (book == null){
            return true;
        }
        return book.getChapters().size() <= book.getNumChapters();
    }
}
