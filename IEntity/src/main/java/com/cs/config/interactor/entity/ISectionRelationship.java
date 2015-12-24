package com.cs.config.interactor.entity;


public interface ISectionRelationship extends ISectionElement {
  
  public Boolean getIsInherited();
  
  public void setIsInherited(Boolean isInherited);
  
  public Boolean getIsMultiple();
  
  public void setIsMultiple(Boolean isMultiple);
  
  public Integer getRelationshipSide();
  
  public void setRelationshipSide(Integer side);
  
  /** Relationship Properties **/
  
  public IRelationshipInstance getRelationshipInstance();
  
  public void setRelationshipInstance(IRelationshipInstance relationshipInstance);
  
}
