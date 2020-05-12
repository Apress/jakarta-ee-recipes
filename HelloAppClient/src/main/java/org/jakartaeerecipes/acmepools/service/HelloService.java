/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jakartaeerecipes.acmepools.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author juneau
 */
@Path("helloclient")
public class HelloService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello() {
      // Obtain an instance of the client
        Client client = ClientBuilder.newClient();
        
        Response res = (Response) client.target("localhost:8096/HelloApp-1.0/rest/helloService/hello")
                .request("text/plain").get();
        return res;
    }
    
   
}
