package com.cs.config.controller.tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.config.delivery.controller.base.IConfigController;
import com.cs.config.interactor.model.TagModel;
import com.cs.config.interactor.usecase.base.ISaveTag;

@Controller
@RequestMapping(value = "/config")
public class SaveTagController implements IConfigController {
  
  @Autowired
  ISaveTag saveTag;
  
  @RequestMapping(value = "/tag ", method = RequestMethod.POST)
  public @ResponseBody Object saveTag(@RequestBody TagModel dataTransferModel) throws Exception
  {
    
    return saveTag.execute(dataTransferModel);
  }
}
