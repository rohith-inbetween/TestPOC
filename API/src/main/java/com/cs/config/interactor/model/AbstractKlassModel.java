package com.cs.config.interactor.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
public abstract class AbstractKlassModel implements IKlassModel {
  
  protected String type;
  
  public String getType(){
    return this.getClass().getName();
  }
  
}
