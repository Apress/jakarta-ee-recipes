/*
 * Author: Josh Juneau
 * Publisher: Apress
 * Book: Jakarta EE Recipes
 */
package org.jakartaeerecipes.chapter01.recipe01_07;

import java.io.IOException;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

/**
 *
 * @author Juneau
 */
public class MyListener implements AsyncListener {

    @Override
    public void onComplete(AsyncEvent event) throws IOException {
        System.out.println("Performing onComplete");
    }

    @Override
    public void onTimeout(AsyncEvent event) throws IOException {
        System.out.println("Performing onTimeout");
    }

    @Override
    public void onError(AsyncEvent event) throws IOException {
        System.out.println("Performing onError");
    }

    @Override
    public void onStartAsync(AsyncEvent event) throws IOException {
        System.out.println("Performing onStartAsync");
    }
}
