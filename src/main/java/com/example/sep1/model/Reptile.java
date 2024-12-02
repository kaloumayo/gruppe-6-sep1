package com.example.sep1.model;

import java.time.LocalDate;

public class Reptile extends AnimalInformation
{
  private boolean isVenomous;

  public Reptile(boolean isMale, LocalDate birthday, String name,
      boolean isVenomous)
  {
    super(isMale, birthday, name);
    this.isVenomous = isVenomous;
  }

  public boolean isVenomous()
  {
    return isVenomous;
  }

  public void setVenomous(boolean venomous)
  {
    isVenomous = venomous;
  }
}
