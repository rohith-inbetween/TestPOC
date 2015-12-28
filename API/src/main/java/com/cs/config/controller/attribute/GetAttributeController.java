package com.cs.config.controller.attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.AttributeModel;
import com.cs.config.interactor.usecase.base.IGetAttribute;

@Controller
@RequestMapping(value = "/config")
public class GetAttributeController implements IConfigController {

  @Autowired
  IGetAttribute getRelationshipInteractor;
  
  @RequestMapping(value = "/attribute/{id}", method = RequestMethod.GET)
  public @ResponseBody Object saveRelationship(
      @PathVariable String id) throws Exception
  {
    AttributeModel attributeModel = new AttributeModel();
    attributeModel.setId(id);
    
    return getRelationshipInteractor.execute(attributeModel);
  }
}
