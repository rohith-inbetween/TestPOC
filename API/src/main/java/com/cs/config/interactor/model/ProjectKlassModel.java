package com.cs.config.interactor.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.cs.config.interactor.entity.IEntity;
import com.cs.config.interactor.entity.ISection;
import com.cs.config.interactor.entity.IStructure;
import com.cs.config.interactor.entity.IStructureValidator;
import com.cs.config.interactor.entity.ITreeEntity;
import com.cs.config.interactor.entity.IType;
import com.cs.config.interactor.entity.Project;

public class ProjectKlassModel implements IProjectKlassModel {
  
  protected Project entity;
  
  public ProjectKlassModel()
  {
    entity = new Project();
  }
  
  public ProjectKlassModel(Project project)
  {
    entity = project;
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
  public IStructureValidator getValidator()
  {
    return entity.getValidator();
  }
  
  @Override
  public void setValidator(IStructureValidator validator)
  {
    entity.setValidator(validator);
  }
  
  @Override
  public List<IStructure> getStructureChildren()
  {
    return entity.getStructureChildren();
  }
  
  @Override
  public void setStructureChildren(List<IStructure> elements)
  {
    entity.setStructureChildren(elements);
  }

  @Override
  public Date getStartDate()
  {
    return entity.getStartDate();
  }

  @Override
  public void setStartDate(Date date)
  {
    entity.setStartDate(date);
  }

  @Override
  public Date getEndDate()
  {
    return entity.getEndDate();
  }

  @Override
  public void setEndDate(Date date)
  {
    entity.setEndDate(date);
  }

  @Override
  public ITreeEntity getParent()
  {
    return this.entity.getParent();
  }

  @Override
  public void setParent(ITreeEntity parent)
  {
    this.entity.setParent(parent);
  }

  @Override
  public List<? extends ITreeEntity> getChildren()
  {
    return this.entity.getChildren();
  }

  @Override
  public void setChildren(List<? extends ITreeEntity> children)
  {
    this.entity.setChildren(children);
  }
  
}
