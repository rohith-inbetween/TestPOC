package com.cs.config.interactor.entity;

import java.util.List;
import java.util.Map;


public class Klass implements IKlassStructure {
  
  protected String id;
  
  protected String label;
  
  protected List<ISection> sections;
  
  protected Map<String,Integer> referencedClassIds;
  
  protected String icon;
  
  protected Klass parent;
  
  protected Klass children;
  
  @Override
  public List<ISection> getSections()
  {
    return this.sections;
  }

  @Override
  public void setSections(List<ISection> sections)
  {
    this.sections = sections;
  }

  @Override
  public Map<String, Integer> getReferencedClassIds()
  {
    return this.referencedClassIds;
  }

  @Override
  public void setReferencedClassIds(Map<String, Integer> referencedClassIds)
  {
    this.referencedClassIds = referencedClassIds;
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
  public IType getType()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setType(IType type) throws Error
  {
    // TODO Auto-generated method stub
    
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
  public ITreeEntity getParent()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setParent(ITreeEntity parent)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<? extends ITreeEntity> getChildren()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setChildren(List<? extends ITreeEntity> children)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public IStructureValidator getValidator()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setValidator(IStructureValidator validator)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<IStructure> getStructureChildren()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setStructureChildren(List<IStructure> elements)
  {
    // TODO Auto-generated method stub
    
  }
  
  
  
}
