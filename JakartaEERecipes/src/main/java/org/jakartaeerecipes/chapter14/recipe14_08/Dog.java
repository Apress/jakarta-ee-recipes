/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.chapter14.recipe14_08;

import javax.json.bind.annotation.JsonbTransient;

/**
 *
 * @author Juneau
 */
public class Dog {
    
    private String name;
    
    private int age;
    
    private String gender;
    
    @JsonbTransient
    private String color;
}
