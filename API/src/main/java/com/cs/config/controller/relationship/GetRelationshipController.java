package com.cs.config.controller.relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.RelationshipModel;
import com.cs.config.interactor.usecase.base.IGetRelationship;

@Controller
@RequestMapping(value = "/config")
public class GetRelationshipController implements IConfigController {

  @Autowired
  IGetRelationship getRelationshipInteractor;
  
  @RequestMapping(value = "/relationship/{id}", method = RequestMethod.GET)
  public @ResponseBody Object getRelationship(
      @PathVariable String id) throws Exception
  {
    RelationshipModel dataTransferModel = new RelationshipModel();
    dataTransferModel.setId(id);
    
    return getRelationshipInteractor.execute(dataTransferModel);
  }
}
