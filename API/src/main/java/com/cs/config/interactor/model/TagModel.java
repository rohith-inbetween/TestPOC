package com.cs.config.interactor.model;

import java.util.List;

import com.cs.config.interactor.entity.IEntity;
import com.cs.config.interactor.entity.ITag;
import com.cs.config.interactor.entity.IType;
import com.cs.config.interactor.entity.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class TagModel implements ITagModel {
  
  protected Tag entity;
  
  public TagModel()
  {
    entity = new Tag();
  }
  
  public TagModel(Tag tag)
  {
    entity = tag;
  }
  
  @JsonIgnore
  @Override
  public IEntity getEntity()
  {
    return entity;
  }
  
  @Override
  public String getId()
  {
    return entity.getId();
  }
  
  @Override
  public void setId(String id)
  {
    entity.setId(id);
  }
  
  @Override
  public String getColor()
  {
    return entity.getColor();
  }
  
  @Override
  public void setColor(String color)
  {
    entity.setColor(color);
  }
  
  @Override
  public ITag getParent()
  {
    return entity.getParent();
  }
  
  @JsonTypeInfo(use=Id.CLASS, defaultImpl=Tag.class)
  @Override
  public void setParent(ITag parent)
  {
    entity.setParent(parent);
  }
  
  @Override
  public String getDescription()
  {
    return entity.getDescription();
  }
  
  @Override
  public void setDescription(String description)
  {
    entity.setDescription(description);
  }
  
  @Override
  public String getTooltip()
  {
    return entity.getTooltip();
  }
  
  @Override
  public void setTooltip(String tooltip)
  {
    entity.setTooltip(tooltip);
  }
  
  @Override
  public Boolean getIsMandatory()
  {
    return entity.getIsMandatory();
  }
  
  @Override
  public void setIsMandatory(Boolean isMandatory)
  {
    entity.setIsMandatory(isMandatory);
  }
  
  @Override
  public String getPlaceholder()
  {
    return entity.getPlaceholder();
  }
  
  @Override
  public void setPlaceholder(String placeholder)
  {
    entity.setPlaceholder(placeholder);
  }
  
  @Override
  public String getLabel()
  {
    return entity.getLabel();
  }
  
  @Override
  public void setLabel(String label)
  {
    entity.setLabel(label);
  }
  
  @Override
  public IType getType()
  {
    return entity.getType();
  }
  
  @Override
  public void setType(IType type)
  {
    entity.setType(type);
  }
  
  @Override
  public String getIcon()
  {
    return entity.getIcon();
  }
  
  @Override
  public void setIcon(String icon)
  {
    entity.setIcon(icon);
  }
  
  @Override
  public List getChildren()
  {
    return entity.getChildren();
  }
  
  @Override
  public void setChildren(List children)
  {
    entity.setChildren(children);
  }
  
}
