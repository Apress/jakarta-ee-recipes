
package org.jakartaeerecipes.chapter05;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.jakartaeerecipes.chapter05.dao.ChapterDAO;

/**
 * Chapter Controller
 * @author Juneau
 */
@SessionScoped
@Named("ch5ChapterController")
public class ChapterController implements java.io.Serializable {
 
    private ChapterDAO chapterDAO;
    
    public ChapterController(){
        chapterDAO = new ChapterDAO();
    }
    
    
}
