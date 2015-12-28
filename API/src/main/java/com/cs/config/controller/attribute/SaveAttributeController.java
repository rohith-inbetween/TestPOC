package com.cs.config.controller.attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.AttributeModel;
import com.cs.config.interactor.usecase.base.ISaveAttribute;

@Controller
@RequestMapping(value = "/config")
public class SaveAttributeController implements IConfigController {

  @Autowired
  ISaveAttribute saveAttribute;
  
  @RequestMapping(value = "/attribute", method = RequestMethod.POST)
  public @ResponseBody Object saveRelationship(
      @RequestBody AttributeModel attributeModel) throws Exception
  {
    
    return saveAttribute.execute(attributeModel);
  }
}
