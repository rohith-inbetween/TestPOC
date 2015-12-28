package com.cs.config.strategy.file.tag;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.cs.config.interactor.entity.Tag;
import com.cs.config.interactor.model.ITagModel;
import com.cs.config.interactor.model.TagModel;
import com.cs.config.store.strategy.base.ISaveTagStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FileSaveTagStrategy implements ISaveTagStrategy {
  
  @Override
  public Object execute(ITagModel model) throws Exception
  {
    try {
      String generatedId = UUID.randomUUID().toString();
      model.setId(generatedId);
      //TODO : What should be the handle????
      Tag parent = (Tag)model.getParent();
      String filePathId = null;
      filePathId = model.getId();
      String json = null;
      ObjectMapper mapper = new ObjectMapper();
      if(parent != null){
        filePathId = parent.getId();
        ITagModel parentTag = mapper.readValue(new File("resources/tags/tag-" + filePathId + ".json"), TagModel.class);
        List<ITagModel> children = (List<ITagModel>)parentTag.getChildren();
        children.add(model);
        json = mapper.writeValueAsString(parentTag);
      } else {
        json = mapper.writeValueAsString(model);
      }
      System.out.println(json);
      File file = new File("resources/tags/tag-" + filePathId + ".json");
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
