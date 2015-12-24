package com.cs.config.interactor.entity;


public interface ITag extends ITagBasic {

  public String getColor();
  
  public void setColor(String color);
  
  public ITag getParent();
  
  public void setParent(ITag parent);
  
}
