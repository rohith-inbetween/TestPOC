package com.cs.config.interactor.entity;




public interface ISectionElement extends IConfigEntity {
  
  public IPosition getStartPosition();
  public void setStartPosition(IPosition iPosition);
  
  public IPosition getEndPosition();
  public void setEndPosition(IPosition iPosition);
  
  public String getDescription();
  
  public void setDescription(String description);
  
  public String getTooltip();
  
  public void setTooltip(String tooltip);
  
  public String getLabel();
  
  public void setLabel(String label);
  
  public Boolean getIsMandatory();
  
  public void setIsMandatory(Boolean isMandatory);
  
  public Boolean getIsInherited();
  
  public void setIsInherited(Boolean isInherited);
  
  public String getPlaceholder();
  
  public void setPlaceholder(String placeholder);
  
}
