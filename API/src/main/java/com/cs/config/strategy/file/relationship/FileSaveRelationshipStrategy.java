package com.cs.config.strategy.file.relationship;

import java.io.File;
import java.io.FileWriter;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IRelationshipModel;
import com.cs.config.store.strategy.base.ISaveRelationshipStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FileSaveRelationshipStrategy implements ISaveRelationshipStrategy {

  @Override
  public Object execute(IRelationshipModel model)
  {
    try {
      String generatedId = UUID.randomUUID().toString();
      model.setId(generatedId);
      
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(model);
      
      File file = new File("resources/relationships/relationship-" + generatedId + ".json");
      file.getParentFile().mkdirs();
      FileWriter writer = new FileWriter(file);
      writer.write(json);
      writer.close();
      
    }
    catch (Exception e) {
      e.printStackTrace();
    }

    return model;
  }

  
}
