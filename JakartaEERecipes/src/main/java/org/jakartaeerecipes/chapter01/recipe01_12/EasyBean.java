
package org.jakartaeerecipes.chapter01.recipe01_12;

/**
 * Recipe 1-12 Yielding and Setting Values
 * @author juneau
 */
public class EasyBean implements java.io.Serializable {
    private String fieldValue;
    
    public EasyBean(){
        fieldValue = null;
    }

    /**
     * @return the fieldValue
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * @param fieldValue the fieldValue to set
     */
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
    
}
