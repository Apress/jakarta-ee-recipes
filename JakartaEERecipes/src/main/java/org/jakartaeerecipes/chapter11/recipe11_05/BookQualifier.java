package org.jakartaeerecipes.chapter11.recipe11_05;

import java.lang.annotation.*;
import javax.inject.Qualifier;

/**
 * 11-5 Qualifier
 * @author juneau
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Qualifier
public @interface BookQualifier {} 
