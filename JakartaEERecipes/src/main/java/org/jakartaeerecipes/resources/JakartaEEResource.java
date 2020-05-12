package org.jakartaeerecipes.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("jakartaee")
public class JakartaEEResource {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
}
