
package org.jakartaeerecipes.chapter13.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Juneau
 */
@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(org.jakartaeerecipes.chapter13.rest.SimpleRest.class);
        resources.add(org.jakartaeerecipes.chapter13.rest.filter.AlertFilter.class);
        resources.add(org.jakartaeerecipes.chapter13.rest.service.EmployeeFacadeREST.class);
        resources.add(org.jakartaeerecipes.chapter13.rest.service.JobsFacadeREST.class);
        resources.add(org.jakartaeerecipes.chapter13.rest.service.SSEEventBroadcaster.class);
        resources.add(org.jakartaeerecipes.chapter13.rest.service.SSEEventResource.class);
        resources.add(org.jakartaeerecipes.resources.JakartaEEResource.class);
    }
    
}
