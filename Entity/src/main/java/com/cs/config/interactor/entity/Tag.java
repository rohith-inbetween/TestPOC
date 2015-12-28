package com.cs.config.interactor.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Tag implements ITag {
  
  protected String     id;
                       
  protected String     description;
                       
  protected String     tooltip;
                       
  protected boolean    isMandatory;
                       
  protected String     placeholder;
                       
  protected String     label;
                       
  protected IType      type;
                       
  protected String     icon;
                       
  protected String     color;
                       
  protected Tag       parent;
                       
  protected List<Tag> children = new ArrayList<>();
                                
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
  
  @Override
  public String getColor()
  {
    return color;
  }
  
  @Override
  public void setColor(String color)
  {
    this.color = color;
  }

  @Override
  public ITreeEntity getParent()
  {
    return this.parent;
  }

  @JsonDeserialize(as=Tag.class)
  @Override
  public void setParent(ITreeEntity parent)
  {
    this.parent = (Tag)parent;
  }

  @Override
  public List<? extends ITreeEntity> getChildren()
  {
    return this.children;
  }

  @JsonDeserialize(contentAs=Tag.class)
  @SuppressWarnings("unchecked")
  @Override
  public void setChildren(List<? extends ITreeEntity> children)
  {
    this.children = (List<Tag>)children;    
  }
  
}
