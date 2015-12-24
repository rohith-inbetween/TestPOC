package com.cs.config.interactor.entity;

import java.util.List;
import java.util.Map;

public interface IKlass extends IKlassBasic<IKlass> {
  
  public IKlass getParent();
  
  public void setParent(IKlass parent);
  
  public List<ISection> getSections();
  
  public void setSections(List<ISection> sections);
  
  public Map<String, Integer> getReferencedClassIds();
  
  public void setReferencedClassIds(Map<String, Integer> referencedClasIds);
  
  /*public List<String> getImages();
  
  public void setImages(List<String> images);*/
  
}
