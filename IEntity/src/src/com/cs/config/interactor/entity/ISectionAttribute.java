package com.cs.config.interactor.entity;


public interface ISectionAttribute extends ISectionElement {
  
  /** Extended Properties **/
  
  public String getDefaultValue();
  
  public void setDefaultValue(String defaultValue);
  
  /** Attribute Properties **/
  
  public IAttribute getAttribute();
  
  public void setAttribute(IAttribute attribute);
  
}
