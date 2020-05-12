
package org.jakartaeerecipes.acmepools;

import java.util.Collections;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.jnosql.diana.api.Settings;
import org.jnosql.diana.api.document.DocumentCollectionManager;
import org.jnosql.diana.api.document.DocumentCollectionManagerFactory;
import org.jnosql.diana.api.document.DocumentConfiguration;
import org.jnosql.diana.mongodb.document.MongoDBDocumentConfiguration;

/**
 *
 * @author juneau
 */
@ApplicationScoped
public class DocumentCollectionManagerProducer {

    // Set the name of the database
  private static final String COLLECTION = "acmepools";

  private DocumentConfiguration configuration;

  private DocumentCollectionManagerFactory managerFactory;

  @PostConstruct
  public void init() {
    configuration = new MongoDBDocumentConfiguration();
    Map<String, Object> settings = Collections.singletonMap("mongodb-server-host-1", "localhost:27017");
    managerFactory = configuration.get(Settings.of(settings));
  }


  @Produces
  public DocumentCollectionManager getManager() {
    return managerFactory.get(COLLECTION);

  }

}