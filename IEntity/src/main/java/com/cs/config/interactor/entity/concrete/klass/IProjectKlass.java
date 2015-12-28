package com.cs.config.interactor.entity.concrete.klass;

import java.util.Date;

import com.cs.config.interactor.entity.IKlassStructure;


public interface IProjectKlass extends IKlassStructure {
  
  public Date getStartDate();
  
  public void setStartDate(Date date);
  
  public Date getEndDate();
  
  public void setEndDate(Date date);
  
}
