/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.beans;

/**
 *
 * @author avbravo
 */
public class Embedded {
  private  String type ;
 private String field ;
 private Boolean esList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Boolean getEsList() {
        return esList;
    }

    public void setEsList(Boolean esList) {
        this.esList = esList;
    }

    public Embedded() {
    }
  
}
