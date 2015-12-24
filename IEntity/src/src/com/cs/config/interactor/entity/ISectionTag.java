package com.cs.config.interactor.entity;


public interface ISectionTag extends ISectionElement {
  
  /** Extended Properties **/
  
  public String getExtendedTagName();
  
  public void setExtendedTagName(String extendedTagName);
  
  public String getDefaultValue();
  
  public void setDefaultValue(String defaultValue);
  
  public Integer getSequence();
  
  public void setSequence(Integer sequence);
  
  public Boolean getIsMandatory();
  
  public void setIsMandatory(Boolean isMandatory);
  
  public Boolean getIsInherited();
  
  public void setIsInherited(Boolean isInherited);
  
  public String getDescription();
  
  public void setDescription(String description);
  
  /** Tag Properties **/
  
  public ITag getTag();
  
  public void setTag(ITag tag);
  
}
