package com.cs.config.interactor.entity;

public class AttributeType implements IAttributeType {

  protected String id;
  
  protected String name;
  
  protected String regex;
  
  protected String errorMessage;
  
  @Override
  public String getId()
  {
    return this.id;
  }

  @Override
  public void setId(String id)
  {
    this.id = id;
  }

  @Override
  public String getName()
  {
    return this.name;
  }

  @Override
  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public String getRegex()
  {
    return this.regex;
  }

  @Override
  public void setRegex(String regex)
  {
    this.regex = regex;
  }

  @Override
  public String getErrorMessage()
  {
    return this.errorMessage;
  }

  @Override
  public void setErrorMessage(String errorMessage)
  {
    this.errorMessage = errorMessage;
  }
  
}
