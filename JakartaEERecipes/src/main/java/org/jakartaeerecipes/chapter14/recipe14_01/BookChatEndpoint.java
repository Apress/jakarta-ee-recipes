
package org.jakartaeerecipes.chapter14.recipe14_01;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value="/bookChatEndpoint")
public class BookChatEndpoint {

 @OnMessage
 public String messageReceiver(String message) {
     return "Message Received: " + message;
 }
}
