package com.cs.config.interactor.model;

import java.util.List;
import java.util.Map;

import com.cs.config.interactor.entity.Content;
import com.cs.config.interactor.entity.IEntity;
import com.cs.config.interactor.entity.IKlass;
import com.cs.config.interactor.entity.ISection;
import com.cs.config.interactor.entity.ITreeEntity;
import com.cs.config.interactor.entity.IType;

public class ContentModel implements IContentModel{

  protected Content entity;
  
  public ContentModel()
  {
    entity = new Content();
  }
  
  public ContentModel(Content content)
  {
    entity = content;
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
  public IKlass getParent()
  {
    return entity.getParent();
  }

  @Override
  public void setParent(IKlass parent)
  {
    entity.setParent(parent);
  }

  @Override
  public List<ISection> getSections()
  {
    return entity.getSections();
  }

  @Override
  public void setSections(List<ISection> sections)
  {
    entity.setSections(sections);
  }

  @Override
  public Map<String, Integer> getReferencedClassIds()
  {
    return entity.getReferencedClassIds();
  }

  @Override
  public void setReferencedClassIds(Map<String, Integer> referencedClasIds)
  {
    entity.setReferencedClassIds(referencedClasIds);
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
  public List<? extends IKlass> getChildren()
  {
    return entity.getChildren();
  }

  @Override
  public void setChildren(List<? extends ITreeEntity> children)
  {
    entity.setChildren(children);
  }

}
