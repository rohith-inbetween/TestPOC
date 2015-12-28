package com.cs.config.interactor.usecase.attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IAttributeModel;
import com.cs.config.interactor.usecase.base.ISaveAttribute;
import com.cs.config.store.strategy.base.ISaveAttributeStrategy;

@Component
public class SaveAttribute implements ISaveAttribute {
  
  @Autowired
  ISaveAttributeStrategy saveAttributeStrategy;

  @Override
  public Object execute(IAttributeModel attributeModel) throws Exception
  {
    
    return saveAttributeStrategy.execute(attributeModel);
  }
  
}
