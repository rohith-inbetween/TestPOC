package com.cs.config.store.strategy.base;

import com.cs.config.interactor.model.IStrategyModel;


public interface IStrategy<T extends IStrategyModel> {
  
  public Object execute(T model) throws Exception;
  
}
