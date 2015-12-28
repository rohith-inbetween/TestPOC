package com.cs.config.interactor.usecase.attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IAttributeModel;
import com.cs.config.interactor.usecase.base.IGetAttribute;
import com.cs.config.store.strategy.base.IGetAttributeStrategy;

@Component
public class GetAttribute implements IGetAttribute {
  
  @Autowired
  IGetAttributeStrategy getAttributeStrategy;

  @Override
  public Object execute(IAttributeModel attributeModel) throws Exception
  {
    return getAttributeStrategy.execute(attributeModel);
  }
  
}
