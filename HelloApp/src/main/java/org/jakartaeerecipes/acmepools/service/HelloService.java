/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.acmepools.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author juneau
 */
@Path("helloService")
public class HelloService {

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello() {
      String message = "Hello World";
      return Response.status(Response.Status.OK).entity(message).build();
    }
    
   
}
