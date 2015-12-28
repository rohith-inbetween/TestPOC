package com.cs.config.interactor.usecase.klass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IKlassModel;
import com.cs.config.interactor.usecase.base.IGetKlass;
import com.cs.config.store.strategy.base.IGetKlassStrategy;

@Component
public class GetKlass implements IGetKlass {
  
  @Autowired
  IGetKlassStrategy getContentKlassStrategy;

  @Override
  public Object execute(IKlassModel klassModel) throws Exception
  {
    return getContentKlassStrategy.execute(klassModel);
  }
  
}
