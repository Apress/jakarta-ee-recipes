package org.jakartaeerecipes.chapter10.recipe10_08;

import java.math.BigDecimal;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.jakartaeerecipes.entity.Book;

/**
 *
 * @author Juneau
 */
public class ValidatorAPI {

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Book book = new Book();
        book.setId(BigDecimal.ONE);
        book.setTitle("The Best Java Book");

        Set<ConstraintViolation<Book>> violations = validator.validate(book);

        for (ConstraintViolation<Book> violation : violations) {
            System.out.println(violation.getMessage());
        }

    }
}
