package com.cs.config.interactor.entity;

import java.util.List;


public interface ITreeEntity {
  
  public ITreeEntity getParent();
  
  public void setParent(ITreeEntity parent);
  
  public List<? extends ITreeEntity> getChildren();
  
  public void setChildren(List<? extends ITreeEntity> children);
  
}
