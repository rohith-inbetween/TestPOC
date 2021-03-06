package com.cs.config.interactor.model;

import com.cs.config.interactor.entity.Attribute;
import com.cs.config.interactor.entity.IEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class AttributeModel implements IAttributeModel {

  protected Attribute attribute;
  
  
  public AttributeModel()
  {
    this.attribute = new Attribute();
  }
  
  public AttributeModel(Attribute attribute)
  {
    this.attribute = attribute;
  }
  
  public String getDescription()
  {
    return attribute.getDescription();
  }

  public void setDescription(String description)
  {
    attribute.setDescription(description);
  }

  public String getTooltip()
  {
    return attribute.getTooltip();
  }

  public void setTooltip(String tooltip)
  {
    attribute.setTooltip(tooltip);
  }

  public Boolean getIsMandatory()
  {
    return attribute.getIsMandatory();
  }

  public void setIsMandatory(Boolean isMandatory)
  {
    attribute.setIsMandatory(isMandatory);
  }

  public String getPlaceholder()
  {
    return attribute.getPlaceholder();
  }

  public void setPlaceholder(String placeholder)
  {
    attribute.setPlaceholder(placeholder);
  }

  public String getLabel()
  {
    return attribute.getLabel();
  }

  public void setLabel(String label)
  {
    attribute.setLabel(label);
  }

  public String getIcon()
  {
    return attribute.getIcon();
  }

  public void setIcon(String icon)
  {
    attribute.setIcon(icon);
  }

  public String getId()
  {
    return attribute.getId();
  }

  public void setId(String id)
  {
    attribute.setId(id);
  }

  public String getDefaultValue()
  {
    return attribute.getDefaultValue();
  }

  public void setDefaultValue(String defaultValue)
  {
    attribute.setDefaultValue(defaultValue);
  }

  @Override
  public IEntity getEntity()
  {
    return this.attribute;
  }
  
}
