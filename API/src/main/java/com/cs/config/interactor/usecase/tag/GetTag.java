
package com.cs.config.interactor.usecase.tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.ITagModel;
import com.cs.config.interactor.usecase.base.IGetTag;
import com.cs.config.store.strategy.base.IGetTagStrategy;

@Component
public class GetTag implements IGetTag {
  
  @Autowired
  IGetTagStrategy fileGetTagStrategy;
  
  @Override
  public Object execute(ITagModel dataModel) throws Exception
  {
    return fileGetTagStrategy.execute(dataModel);
  }
  
}
