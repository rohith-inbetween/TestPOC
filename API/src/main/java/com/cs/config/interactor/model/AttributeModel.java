package com.cs.config.interactor.model;

import com.cs.config.interactor.entity.Attribute;
import com.cs.config.interactor.entity.AttributeType;
import com.cs.config.interactor.entity.IAttributeType;
import com.cs.config.interactor.entity.IEntity;
import com.cs.config.interactor.entity.IType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonView;


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

  public IAttributeType getType()
  {
    return attribute.getType();
  }
  
  //TODO : Find solution to this!!!
  
//  @JsonTypeInfo(use=Id.CLASS, defaultImpl=AttributeType.class)
  public void setType(IType type)
  {
    attribute.setType(type);
  }
  
  @JsonProperty
  public void setType(AttributeType type)
  {
    attribute.setType(type);
  }

  @JsonIgnore
  @Override
  public IEntity getEntity()
  {
    return this.attribute;
  }
  
}
