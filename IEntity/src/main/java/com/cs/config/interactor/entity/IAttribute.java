package com.cs.config.interactor.entity;

public interface IAttribute extends IConfigMasterPropertyEntity {
  
  public String getDefaultValue();
  
  public void setDefaultValue(String defaultValue);
  
}
