package com.cs.config.interactor.entity;

import java.util.List;


public interface ITreeEntity<T> {
  
  public List<? extends T> getChildren();
  
  public void setChildren(List<? extends T> children);
  
}
