package com.cs.config.controller.relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.RelationshipModel;
import com.cs.config.interactor.usecase.base.ISaveRelationshipInteractor;

@Controller
@RequestMapping(value = "/config")
public class SaveRelationshipController implements IConfigController {

  @Autowired
  ISaveRelationshipInteractor saveRelationshipInteractor;
  
  @RequestMapping(value = "/relationship", method = RequestMethod.POST)
  public @ResponseBody Object saveRelationship(
      @RequestBody RelationshipModel dataTransferModel) throws Exception
  {
    
    return saveRelationshipInteractor.execute(dataTransferModel);
  }
}
