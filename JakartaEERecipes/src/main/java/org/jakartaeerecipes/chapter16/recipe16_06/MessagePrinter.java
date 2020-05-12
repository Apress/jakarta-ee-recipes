
package org.jakartaeerecipes.chapter16.recipe16_06;

/**
 *
 * @author Juneau
 */
public class MessagePrinter implements Runnable {

    @Override
    public void run() {
        printMessage();
    }
    
    public void printMessage(){
        System.out.println("Here we are performing some work...");
    }
}
