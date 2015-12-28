package com.cs.config.interactor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.cs.config.interactor.entity.concrete.klass.IProjectKlass;

public class ProjectKlass implements IProjectKlass {
  
  protected String               id;
  
  protected ProjectKlass              parent;
  
  protected List<Section>       sections;
  
  protected Map<String, Integer> referencedClassIds;
  
  protected String               label;
  
  protected IType                type;
  
  protected String               icon;
  
  protected List<ProjectKlass>        children = new ArrayList<>();
  
  protected IStructureValidator  validator;
  
  protected List<IStructure>     structureChildren;
  
  protected Date                 startDate;
  
  protected Date                 endDate;
  
  @Override
  public List<? extends ISection> getSections()
  {
    return sections;
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public void setSections(List<? extends ISection> sections)
  {
    this.sections = (List<Section>)sections;
  }
  
  @Override
  public Map<String, Integer> getReferencedClassIds()
  {
    return referencedClassIds;
  }
  
  @Override
  public void setReferencedClassIds(Map<String, Integer> referencedClasIds)
  {
    this.referencedClassIds = referencedClasIds;
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
  public IStructureValidator getValidator()
  {
    return validator;
  }
  
  @Override
  public void setValidator(IStructureValidator validator)
  {
    this.validator = validator;
  }
  
  @Override
  public List<IStructure> getStructureChildren()
  {
    return structureChildren;
  }
  
  @Override
  public void setStructureChildren(List<IStructure> elements)
  {
    this.structureChildren = elements;
  }
  
  @Override
  public Date getStartDate()
  {
    return startDate;
  }
  
  @Override
  public void setStartDate(Date date)
  {
    this.startDate = date;
  }
  
  @Override
  public Date getEndDate()
  {
    return endDate;
  }
  
  @Override
  public void setEndDate(Date date)
  {
    this.endDate = date;
  }
  
  @Override
  public ITreeEntity getParent()
  {
    return this.parent;
  }
  
  @Override
  public void setParent(ITreeEntity parent)
  {
    this.parent = (ProjectKlass) parent;
  }
  
  @Override
  public List<? extends ITreeEntity> getChildren()
  {
    return this.children;
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public void setChildren(List<? extends ITreeEntity> children)
  {
    this.children = (List<ProjectKlass>) children;
  }
  
}
