package com.cs.config.strategy.file.attribute;

import java.io.File;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.AttributeModel;
import com.cs.config.interactor.model.IAttributeModel;
import com.cs.config.store.strategy.base.IGetAttributeStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class FileGetAttributeStrategy implements IGetAttributeStrategy {

  @Override
  public Object execute(IAttributeModel model)
  {
    AttributeModel modelToReturn = null;
    
    try {
      ObjectMapper mapper = new ObjectMapper();
      modelToReturn = mapper.readValue(new File("resources/attributes/attribute-" + model.getId() + ".json"), AttributeModel.class);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return modelToReturn;
  }

}
