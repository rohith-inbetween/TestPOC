package com.cs.config.interactor.entity;

public interface IUser extends IConfigMasterEntity {

  public String getFirstName();
  
  public void setFirstName(String firstName);
  
  public String getLastName();
  
  public void setLastName(String lastName);
  
  public String getGender();
  
  public void setGender(String gender);
  
  public String getEmail();
  
  public void setEmail(String email);
  
  public String getContact();
  
  public void setContact(String contact);
  
  public String getBirthDate();
  
  public void setBirthDate(String birthDate);
  
  public String getImage();
  
  public void setImage(String image);
}
