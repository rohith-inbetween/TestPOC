package com.cs.config.interactor.entity;

public class Attribute implements IAttribute {
  
  protected String         id;
  
  protected String         label;
  
  protected String         description;
  
  protected String         tooltip;
  
  protected String         defaultValue;
  
  protected Boolean        isMandatory;
  
  protected String         placeholder;
  
  protected String         icon;
  
  @Override
  public String getDescription()
  {
    return this.description;
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
  public String getDefaultValue()
  {
    return this.defaultValue;
  }
  
  @Override
  public void setDefaultValue(String defaultValue)
  {
    this.defaultValue = defaultValue;
  }
  
}
