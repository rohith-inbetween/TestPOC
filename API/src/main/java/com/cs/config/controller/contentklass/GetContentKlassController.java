package com.cs.config.controller.contentklass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.ContentKlassModel;
import com.cs.config.interactor.usecase.base.IGetKlass;

@Controller
@RequestMapping(value = "/config")
public class GetContentKlassController implements IConfigController {

  @Autowired
  IGetKlass getContentKlass;
  
  @RequestMapping(value = "/contentklass/{id}", method = RequestMethod.GET)
  public @ResponseBody Object saveRelationship(
      @PathVariable String id) throws Exception
  {
    ContentKlassModel contentKlassModel = new ContentKlassModel();
    contentKlassModel.setId(id);
    
    return getContentKlass.execute(contentKlassModel);
  }
}
