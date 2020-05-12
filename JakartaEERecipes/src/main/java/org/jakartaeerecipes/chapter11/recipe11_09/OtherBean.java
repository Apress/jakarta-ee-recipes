
package org.jakartaeerecipes.chapter11.recipe11_09;

import java.lang.annotation.Annotation;
import javax.inject.Named;


/**
 *
 * @author Juneau
 */
@Named("OtherBean")
public class OtherBean {
 //   @Inject Bean<OrderBean> bean;

        public String getBeanName(){
    //    return bean.getName();
            return null;
    }
    
    public Class<? extends Annotation> getBeanScope(){
        return null; //bean.getScope();
    }
}

