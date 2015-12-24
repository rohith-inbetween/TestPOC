package com.cs.config.interactor.entity;

import java.util.List;

public interface ISection extends IConfigMasterEntity {
  
  public List<ISectionElement> getElements();
  
  public void setElements(List<ISectionElement> elements);
  
}
