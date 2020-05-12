
package org.jakartaeerecipes.acmepools.service;

import com.mongodb.MongoWriteException;
import java.util.List;
import java.util.Random;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.jakartaeerecipes.acmepools.DocumentCollectionManagerProducer;
import org.jakartaeerecipes.acmepools.entity.Customer;
import org.jakartaeerecipes.acmepools.entity.Pool;
import org.jnosql.artemis.document.DocumentTemplate;
import org.jnosql.diana.api.document.Document;
import org.jnosql.diana.api.document.DocumentDeleteQuery;
import org.jnosql.diana.api.document.DocumentEntity;
import org.jnosql.diana.api.document.DocumentQuery;
import static org.jnosql.diana.api.document.query.DocumentQueryBuilder.delete;
import static org.jnosql.diana.api.document.query.DocumentQueryBuilder.select;

/**
 *
 * @author juneau
 */
@Path("acmepools")
public class AcmePoolsService {

    @Inject
    DocumentCollectionManagerProducer manager;

    @Inject
    DocumentTemplate documentTemplate;

    @GET
    @Path("testDocumentDb")
    public String testDocumentDb() {

        String returnValue = "";
        Random random = new Random();
        Long id = random.nextLong();

        Customer customer = new Customer("Josh", "Juneau", "123 AcmeWay", "JavaLand", "JJ", "12345");

        Pool pool = new Pool(id, 32.0, 16.0, customer);

        Pool savedPool = documentTemplate.insert(pool);

        returnValue = "Pool length: " + savedPool.getLength() + " - Customer: " + savedPool.getCustomer().getLastName();
        
       
        
        DocumentQuery query = select().from("Pool").where("length").eq(32.0).build();
        List<Pool> pools = documentTemplate.select(query);
        System.out.println("Pool:" + pools);
        return returnValue;
    }
    
    /**
     * This method is being shown merely for example, as it will not run within
     * an enterprise environment.  This code is to be run within a Java SE environment.
     */
//    @GET
//    @Path("seContainerExample")
//    public void seContainerExample(){
//     
//        try (SeContainer se = SeContainerInitializer.newInstance().initialize()){
//            DocumentTemplate documentTemplate = se.select(DocumentTemplate.class).get();
//            DocumentQuery query = select().from("Pool").build();
//
//            List<Pool> results = documentTemplate.select(query);
//            for(Pool p:results){
//                System.out.println(p);
//            }
//        }
//    }
    
    @GET
    @Path("retrieveAllRecords")
    public List testDocumentDbAll() {
        DocumentQuery query = select().from("Pool").build();
        List<DocumentEntity> entities = manager.getManager().select(query);

        return entities;
    }

    @GET
    @Path("createNewDocument/{id}")
    public void createNewDocument(@PathParam("id") int id) {
        System.out.println("Insert new document with ID: " + id);
        if (id > 0) {
            // Utilize DocumentEntity to create a document
            try {
                DocumentEntity documentEntity = DocumentEntity.of("Pool");
                documentEntity.add(Document.of("_id", id));
                documentEntity.add(Document.of("length", 30.0));
                documentEntity.add(Document.of("width", 15.0));
                DocumentEntity saved = manager.getManager().insert(documentEntity);
                
                //Update Document
                saved.add(Document.of("Customer", "Juneau"));
                DocumentEntity updated = manager.getManager().update(saved);
            } catch (MongoWriteException e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("You cannot insert a NULL entity, please provide an id");
        }
    }
    
    public void deleteDocument(){
        DocumentDeleteQuery delete = delete().from("Pools").where("length").gte(36.0).build();
        manager.getManager().delete(delete);
    }
}
