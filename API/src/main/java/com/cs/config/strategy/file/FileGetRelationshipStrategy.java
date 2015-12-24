package com.cs.config.strategy.file;

import java.io.File;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IRelationshipModel;
import com.cs.config.interactor.model.RelationshipModel;
import com.cs.config.store.strategy.base.IGetRelationshipStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class FileGetRelationshipStrategy implements IGetRelationshipStrategy {

  @Override
  public Object execute(IRelationshipModel model)
  {
    RelationshipModel modelToReturn = null;
    
    try {
      ObjectMapper mapper = new ObjectMapper();
      modelToReturn = mapper.readValue(new File("resources/relationships/relationship-" + model.getId() + ".json"), RelationshipModel.class);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return modelToReturn;
  }

}
