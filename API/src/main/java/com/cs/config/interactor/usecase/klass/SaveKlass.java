package com.cs.config.interactor.usecase.klass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IKlassModel;
import com.cs.config.interactor.usecase.base.ISaveKlass;
import com.cs.config.store.strategy.base.ISaveKlassStrategy;

@Component
public class SaveKlass implements ISaveKlass {
  
  @Autowired
  ISaveKlassStrategy saveKlassStrategy;

  @Override
  public Object execute(IKlassModel klassModel) throws Exception
  {
    return saveKlassStrategy.execute(klassModel);
  }
  
}
