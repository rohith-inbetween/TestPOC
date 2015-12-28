package com.cs.config.controller.contentklass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.ContentKlassModel;
import com.cs.config.interactor.usecase.base.ISaveKlass;

@Controller
@RequestMapping(value = "/config")
public class SaveContentKlassController implements IConfigController {

  @Autowired
  ISaveKlass saveContentKlass;
  
  @RequestMapping(value = "/contentklass", method = RequestMethod.POST)
  public @ResponseBody Object saveRelationship(
      @RequestBody ContentKlassModel contentKlassModel) throws Exception
  {
    
    return saveContentKlass.execute(contentKlassModel);
  }
}
