package com.cs.config.interactor.entity;

public class RelationshipType implements IRelationshipType {

  protected String id;
  
  @Override
  public String getId()
  {
    return this.id;
  }

  @Override
  public void setId(String id)
  {
    this.id = id;
  }

  
  
}
