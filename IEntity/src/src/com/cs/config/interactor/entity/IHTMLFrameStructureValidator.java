package com.cs.config.interactor.entity;

import java.util.List;


public interface IHTMLFrameStructureValidator extends IStructureValidator {
  
  public List<String> getAllowedRTEIcons();

  public void setAllowedRTEIcons(List<String> allowedRTEIcons);
  
  public long getAllowedMaxCharacters();

  public void setAllowedMaxCharacters(Long allowedMaxCharacters);
  
}
