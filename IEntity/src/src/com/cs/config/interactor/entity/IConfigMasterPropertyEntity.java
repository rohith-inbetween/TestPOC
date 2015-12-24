package com.cs.config.interactor.entity;

public interface IConfigMasterPropertyEntity extends IConfigMasterEntity {
  
  public String getDescription();
  
  public void setDescription(String description);
  
  public String getTooltip();
  
  public void setTooltip(String tooltip);
  
  public Boolean getIsMandatory();
  
  public void setIsMandatory(Boolean isMandatory);
  
  public String getPlaceholder();
  
  public void setPlaceholder(String placeholder);
  
}
