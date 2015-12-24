package com.cs.config.interactor.entity;



public interface IAttribute extends IConfigMasterPropertyEntity {
  
  public IAttributeType getType();
  
  public void setType(IAttributeType type);
  
  public String getDefaultValue();
  
  public void setDefaultValue(String defaultValue);
  
}
