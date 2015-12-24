package com.cs.config.interactor.entity;

import java.util.List;

public interface IRelationshipInstance extends IConfigEntity {
  
  public void setSectionRelationships(List<ISectionRelationship> left);
  
  public List<ISectionRelationship> getSectionRelationships();
  
  public void setRelationship(IRelationship relationship);
  
  public IRelationship getRelationship();
  
}
