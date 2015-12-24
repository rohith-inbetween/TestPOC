package com.cs.config.interactor.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IRelationshipModel;
import com.cs.config.interactor.usecase.base.ISaveRelationshipInteractor;
import com.cs.config.store.strategy.base.ISaveRelationshipStrategy;

@Component
public class SaveRelationshipInteractor implements ISaveRelationshipInteractor {
  
  @Autowired
  ISaveRelationshipStrategy fileSaveRelationshipStrategy;

  @Override
  public Object execute(IRelationshipModel dataModel)
  {
    
    return fileSaveRelationshipStrategy.execute(dataModel);
  }
  
}
