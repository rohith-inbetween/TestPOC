package com.cs.config.interactor.entity;



public interface IAttributeType extends IType {
  
  public String getId();

  public void setId(String id);
  
  public String getName();
    
  public void setName(String name);
  
  public String getRegex();
  
  public void setRegex(String regex);
  
  public String getErrorMessage();
  
  public void setErrorMessage(String errorMessage);
  
}
