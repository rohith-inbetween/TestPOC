package com.cs.config.strategy.file.attribute;

import java.io.File;
import java.io.FileWriter;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.IAttributeModel;
import com.cs.config.store.strategy.base.ISaveAttributeStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FileSaveAttributeStrategy implements ISaveAttributeStrategy {

  @Override
  public Object execute(IAttributeModel model)
  {
    try {
      String generatedId = UUID.randomUUID().toString();
      model.setId(generatedId);
      
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(model);
      
      File file = new File("resources/attributes/attribute-" + generatedId + ".json");
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
