package com.cs.config.interactor.usecase.base;

import com.cs.config.interactor.model.IControllerModel;


public interface IInteractor<T extends IControllerModel> {
  
  public Object execute(T dataModel);
  
}
