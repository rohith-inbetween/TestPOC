package com.cs.config.interactor.entity;

public interface IConfigMasterEntity extends IConfigEntity {
 
  public String getLabel();
  
  public void setLabel(String label);
  
  public IType getType();
  
  public void setType(IType type) throws Error;
  
  public String getIcon();
  
  public void setIcon(String icon);
  
}
