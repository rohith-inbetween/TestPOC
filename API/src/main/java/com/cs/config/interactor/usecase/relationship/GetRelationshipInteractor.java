package com.cs.config.interactor.usecase.relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IRelationshipModel;
import com.cs.config.interactor.usecase.base.IGetRelationshipInteractor;
import com.cs.config.store.strategy.base.IGetRelationshipStrategy;

@Component
public class GetRelationshipInteractor implements IGetRelationshipInteractor {
  
  @Autowired
  IGetRelationshipStrategy fileGetRelationshipStrategy;

  @Override
  public Object execute(IRelationshipModel dataModel) throws Exception
  {
    
    return fileGetRelationshipStrategy.execute(dataModel);
  }
  
}
