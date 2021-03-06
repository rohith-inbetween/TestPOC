package com.cs.config.controller.tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.TagModel;
import com.cs.config.interactor.usecase.base.IGetTag;

@Controller
@RequestMapping(value = "/config")
public class GetTagController implements IConfigController {
  
  @Autowired
  IGetTag getTag;
  
  @RequestMapping(value = "/tag/{id}", method = RequestMethod.GET)
  public @ResponseBody Object getTag(
      @PathVariable String id) throws Exception
  {
    TagModel dataTransferModel = new TagModel();
    dataTransferModel.setId(id);
    
    return getTag.execute(dataTransferModel);
  }
}
