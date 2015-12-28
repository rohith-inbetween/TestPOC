package com.cs.config.interactor.entity;

public class TagTypeValue implements ITagTypeValue {
  
  protected String id;
  
  protected String value;
  
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
  
  @Override
  public String getValue()
  {
    return this.value;
  }
  
  @Override
  public void setValue(String value)
  {
    this.value = value;
  }
  
}
