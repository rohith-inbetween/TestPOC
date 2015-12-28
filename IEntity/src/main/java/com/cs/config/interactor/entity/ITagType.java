package com.cs.config.interactor.entity;

import java.util.List;

public interface ITagType extends IType {

  public List<? extends ITagTypeValue> getValues();
  
  public void setValues(List<? extends ITagTypeValue> values);
  
}
