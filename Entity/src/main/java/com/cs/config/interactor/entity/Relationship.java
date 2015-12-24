package com.cs.config.interactor.entity;


public class Relationship implements IRelationship {
  
  protected String id;
  
  protected String description;
  
  protected String tooltip;
  
  protected boolean isMandatory;
  
  protected String placeholder;
  
  protected String label;
  
  protected IType type;
  
  protected String icon;
  
  @Override
  public String getDescription()
  {
    return description;
  }
  
  @Override
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  @Override
  public String getTooltip()
  {
    return tooltip;
  }
  
  @Override
  public void setTooltip(String tooltip)
  {
    this.tooltip = tooltip;
  }
  
  @Override
  public Boolean getIsMandatory()
  {
    return isMandatory;
  }
  
  @Override
  public void setIsMandatory(Boolean isMandatory)
  {
    this.isMandatory = isMandatory;
  }
  
  @Override
  public String getPlaceholder()
  {
    return placeholder;
  }
  
  @Override
  public void setPlaceholder(String placeholder)
  {
    this.placeholder = placeholder;
  }
  
  @Override
  public String getLabel()
  {
    return label;
  }
  
  @Override
  public void setLabel(String label)
  {
    this.label = label;
  }
  
  @Override
  public IType getType()
  {
    return type;
  }
  
  @Override
  public void setType(IType type)
  {
    this.type = type;
  }
  
  @Override
  public String getIcon()
  {
    return icon;
  }
  
  @Override
  public void setIcon(String icon)
  {
    this.icon = icon;
  }
  
  @Override
  public String getId()
  {
    return id;
  }
  
  @Override
  public void setId(String id)
  {
    this.id = id;
  }
  
}
