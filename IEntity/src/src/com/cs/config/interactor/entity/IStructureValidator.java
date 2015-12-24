package com.cs.config.interactor.entity;

import java.util.List;


public interface IStructureValidator extends IConfigEntity {
  
  public List<String> getAllowedFrames();
  
  public List<String> setAllowedFrames(List<String> allowedFrames);
  
}
