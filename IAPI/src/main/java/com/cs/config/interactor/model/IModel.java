package com.cs.config.interactor.model;

import com.cs.config.interactor.entity.IEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;


public interface IModel extends IEntity {
  
  @JsonIgnore
  public IEntity getEntity();
  
}
