package com.cs.config.interactor.entity;

import java.util.List;


public class Section implements ISection {

  protected String id;
  
  protected String label;
  
  protected String icon;
  
  protected List<ISectionElement> elements;
  
  @Override
  public String getLabel()
  {
    return this.label;
  }

  @Override
  public void setLabel(String label)
  {
    this.label = label;
  }

  @Override
  public String getIcon()
  {
    return this.icon;
  }

  @Override
  public void setIcon(String icon)
  {
    this.icon = icon;
  }

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
  public List<ISectionElement> getElements()
  {
    return this.elements;
  }

  @Override
  public void setElements(List<ISectionElement> elements)
  {
    this.elements = elements;
  }
  
}
