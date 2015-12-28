package com.cs.config.strategy.file;

import java.io.File;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.ITagModel;
import com.cs.config.interactor.model.TagModel;
import com.cs.config.store.strategy.base.IGetTagStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FileGetTagStrategy implements IGetTagStrategy {
  
  @Override
  public Object execute(ITagModel model)
  {
    TagModel modelToReturn = null;
    
    try {
      ObjectMapper mapper = new ObjectMapper();
      modelToReturn = mapper.readValue(new File("resources/tags/tag-" + model.getId() + ".json"), TagModel.class);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
    return modelToReturn;
  }
  
}
