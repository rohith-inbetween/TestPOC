package com.cs.config.interactor.entity;

import java.util.List;

public interface IStructure extends IConfigMasterEntity {
  
  public IStructureValidator getValidator();
  
  public void setValidator(IStructureValidator validator);
  
  public List<IStructure> getStructureChildren();
  
  public void setStructureChildren(List<IStructure> elements);
  
}
