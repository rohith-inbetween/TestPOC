
package com.cs.config.interactor.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.ITagModel;
import com.cs.config.interactor.usecase.base.IGetTagInteractor;
import com.cs.config.store.strategy.base.IGetTagStrategy;

@Component
public class GetTagInteractor implements IGetTagInteractor {
  
  @Autowired
  IGetTagStrategy fileGetTagStrategy;
  
  @Override
  public Object execute(ITagModel dataModel)
  {
    
    return fileGetTagStrategy.execute(dataModel);
  }
  
}
