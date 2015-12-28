package com.cs.config.strategy.file.klass;

import java.io.File;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.model.AbstractKlassModel;
import com.cs.config.interactor.model.IKlassModel;
import com.cs.config.store.strategy.base.IGetKlassStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FileGetKlassStrategy implements IGetKlassStrategy {
  
  @Override
  public Object execute(IKlassModel model)
  {
    AbstractKlassModel klassModelToReturn = null;
    try {
      ObjectMapper mapper = new ObjectMapper();
      klassModelToReturn = mapper.readValue(new File("resources/klasses/klass-" + model.getId() + ".json"), AbstractKlassModel.class);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
    return klassModelToReturn;
  }
  
}
