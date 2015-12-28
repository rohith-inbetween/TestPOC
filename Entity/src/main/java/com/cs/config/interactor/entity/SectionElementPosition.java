package com.cs.config.interactor.entity;


public class SectionElementPosition implements IPosition {

  protected Integer x;
  
  protected Integer y;
  
  @Override
  public String getId()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setId(String id)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Integer getX()
  {
    return this.x;
  }

  @Override
  public Integer getY()
  {
    return this.y;
  }

  @Override
  public void setX(Integer x)
  {
    this.x = x;
  }

  @Override
  public void setY(Integer y)
  {
    this.y = y;
  }
  
}
