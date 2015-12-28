package com.cs.config.interactor.usecase.tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.ITagModel;
import com.cs.config.interactor.usecase.base.ISaveTagInteractor;
import com.cs.config.store.strategy.base.ISaveTagStrategy;

@Component
public class SaveTagInteractor implements ISaveTagInteractor {
  
  @Autowired
  ISaveTagStrategy fileSaveTagStrategy;
  
  @Override
  public Object execute(ITagModel dataModel) throws Exception
  {
    
    return fileSaveTagStrategy.execute(dataModel);
  }
  
}
