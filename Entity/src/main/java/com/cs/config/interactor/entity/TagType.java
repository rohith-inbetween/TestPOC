package com.cs.config.interactor.entity;

import java.util.List;


public class TagType implements ITagType {

  protected String id;
  
  protected List<TagTypeValue> values;
  
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
  public List<? extends ITagTypeValue> getValues()
  {
    return this.values;
  }

  @Override
  public void setValues(List<? extends ITagTypeValue> values)
  {
    this.values = (List<TagTypeValue>)values; 
  }
  
}
