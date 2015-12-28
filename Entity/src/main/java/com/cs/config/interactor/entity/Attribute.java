package com.cs.config.interactor.entity;



public class Attribute implements IAttribute {
  
  protected String label;

  protected String description;
  
  protected String tooltip;
  
  protected Boolean isMandatory;
  
  protected String placeholder;
  
  protected IAttributeType type;
  
  @Override
  public String getDescription()
  {
    return this.getDescription();
  }
  
  @Override
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  @Override
  public String getTooltip()
  {
    return this.tooltip;
  }
  
  @Override
  public void setTooltip(String tooltip)
  {
    this.tooltip = tooltip;
  }
  
  @Override
  public Boolean getIsMandatory()
  {
    return this.isMandatory;
  }
  
  @Override
  public void setIsMandatory(Boolean isMandatory)
  {
    this.isMandatory = isMandatory;
  }
  
  @Override
  public String getPlaceholder()
  {
    return this.placeholder;
  }
  
  @Override
  public void setPlaceholder(String placeholder)
  {
    this.placeholder = placeholder;
  }
  
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
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  public void setIcon(String icon)
  {
    // TODO Auto-generated method stub
    
  }
  
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
  public String getDefaultValue()
  {
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  public void setDefaultValue(String defaultValue)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public IAttributeType getType()
  {
    return this.type;
  }

  @Override
  public void setType(IType type)
  {
    this.type = (IAttributeType)type;
  }

}
