package com.example.sep1.model;

import java.time.LocalDate;

public class Bird extends AnimalInformation
{
  private boolean isTame;
  private boolean isTameable;

  public Bird(boolean isMale, LocalDate birthday, String name, boolean isTame,
      boolean isTameable)
  {
    super(isMale, birthday, name);
    this.isTame = isTame;
    this.isTameable = isTameable;
  }

  public boolean isTame()
  {
    return isTame;
  }

  public void setTame(boolean tame)
  {
    isTame = tame;
  }

  public boolean isTameable()
  {
    return isTameable;
  }

  public void setTameable(boolean tameable)
  {
    isTameable = tameable;
  }
}
