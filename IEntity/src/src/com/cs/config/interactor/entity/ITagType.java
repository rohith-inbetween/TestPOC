package com.cs.config.interactor.entity;

import java.util.List;

public interface ITagType extends IType {

  public List<ITagTypeValue> getValues();
  
  public void setValues(List<ITagTypeValue> values);
  
}
