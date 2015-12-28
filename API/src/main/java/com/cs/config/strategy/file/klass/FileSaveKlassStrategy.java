package com.cs.config.strategy.file.klass;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.entity.IKlass;
import com.cs.config.interactor.model.AbstractKlassModel;
import com.cs.config.interactor.model.IKlassModel;
import com.cs.config.store.strategy.base.ISaveKlassStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FileSaveKlassStrategy implements ISaveKlassStrategy {
  
  @Override
  public Object execute(IKlassModel model) throws Exception
  {
    try {
      String generatedId = UUID.randomUUID().toString();
      model.setId(generatedId);
      IKlass parent = (IKlass)model.getParent();
      String filePathId = null;
      filePathId = model.getId();
      String json = null;
      ObjectMapper mapper = new ObjectMapper();
      if(parent != null){ 
        filePathId = parent.getId();
        AbstractKlassModel parentKlass = mapper.readValue(new File("resources/klasses/klass-" + filePathId + ".json"), AbstractKlassModel.class);
        List<IKlass> children = (List<IKlass>)parentKlass.getChildren();
        children.add(model);
        json = mapper.writeValueAsString(parentKlass);
      } else {
        json = mapper.writeValueAsString(model);
      }
      File file = new File("resources/klasses/klass-" + filePathId + ".json");
      file.getParentFile().mkdirs();
      FileWriter writer = new FileWriter(file,false);
      writer.write(json);
      writer.close();
    }
    catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
    
    return model;
  }
  
}
