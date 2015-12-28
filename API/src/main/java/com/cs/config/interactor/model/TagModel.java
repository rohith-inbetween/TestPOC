package com.cs.config.interactor.model;

import java.util.List;

import com.cs.config.interactor.entity.IEntity;
import com.cs.config.interactor.entity.ITreeEntity;
import com.cs.config.interactor.entity.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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
  public String getIcon()
  {
    return entity.getIcon();
  }
  
  @Override
  public void setIcon(String icon)
  {
    entity.setIcon(icon);
  }
  
  @JsonDeserialize(as=Tag.class)
  @Override
  public void setParent(ITreeEntity parent)
  {
    this.entity.setParent(parent);
  }
  
  @Override
  public ITreeEntity getParent()
  {
    return this.entity.getParent();
  }

  @Override
  public List<? extends ITreeEntity> getChildren()
  {
    return this.entity.getChildren();
  }

  @JsonDeserialize(contentAs=Tag.class)
  @Override
  public void setChildren(List<? extends ITreeEntity> children)
  {
    this.entity.setChildren(children);
  }
  
}
