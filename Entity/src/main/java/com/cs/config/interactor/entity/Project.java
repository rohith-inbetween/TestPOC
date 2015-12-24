package com.cs.config.interactor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.cs.config.interactor.entity.concrete.klass.IContent;
import com.cs.config.interactor.entity.concrete.klass.IProject;

public class Project implements IProject {
  
  protected String               id;
                                 
  protected IContent             parent;
                                 
  protected List<ISection>       sections;
                                 
  protected Map<String, Integer> referencedClassIds;
                                 
  protected String               label;
                                 
  protected IType                type;
                                 
  protected String               icon;
                                 
  protected List<IContent>       children = new ArrayList<IContent>();
                                          
  protected IStructureValidator  validator;
                                 
  protected List<IStructure>     structureChildren;
                                 
  protected Date                 startDate;
                                 
  protected Date                 endDate;
                                 
  @Override
  public IKlass getParent()
  {
    return parent;
  }
  
  @Override
  public void setParent(IKlass parent)
  {
    this.parent = (IContent) parent;
  }
  
  @Override
  public List<ISection> getSections()
  {
    return sections;
  }
  
  @Override
  public void setSections(List<ISection> sections)
  {
    this.sections = sections;
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
  public IType getType()
  {
    return type;
  }
  
  @Override
  public void setType(IType type)
  {
    this.type = type;
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
  public List<? extends IKlass> getChildren()
  {
    return children;
  }
  
  @Override
  public void setChildren(List<? extends IKlass> children)
  {
    this.children = (List<IContent>) children;
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
  
}
