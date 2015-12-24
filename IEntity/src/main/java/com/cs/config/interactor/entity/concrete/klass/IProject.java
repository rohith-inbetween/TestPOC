package com.cs.config.interactor.entity.concrete.klass;

import java.util.Date;

import com.cs.config.interactor.entity.IKlassStructure;


public interface IProject extends IKlassStructure {
  
  public Date getStartDate();
  
  public Date setStartDate();
  
  public Date getEndDate();
  
  public Date setEndDate();
  
}
