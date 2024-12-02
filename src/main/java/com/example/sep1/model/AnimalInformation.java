package com.example.sep1.model;

import java.time.LocalDate;

public class AnimalInformation
{
  private boolean isMale;
  private LocalDate birthday;
  private String name;

  public AnimalInformation(boolean isMale, LocalDate birthday, String name)
  {
    this.isMale = isMale;
    this.birthday = birthday;
    this.name = name;
  }

  public boolean isMale()
  {
    return isMale;
  }

  public void setMale(boolean male)
  {
    isMale = male;
  }

  public LocalDate getBirthday()
  {
    return birthday;
  }

  public void setBirthday(LocalDate birthday)
  {
    this.birthday = birthday;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

}
