package com.example.sep1.model;

import java.time.LocalDate;

public class Fish extends AnimalInformation
{
  private boolean isSaltWaterFish;

  public Fish(boolean isMale, LocalDate birthday, String name,
      boolean isSaltWaterFish)
  {
    super(isMale, birthday, name);
    this.isSaltWaterFish = isSaltWaterFish;
  }

  public boolean isSaltWaterFish()
  {
    return isSaltWaterFish;
  }

  public void setSaltWaterFish(boolean saltWaterFish)
  {
    isSaltWaterFish = saltWaterFish;
  }
}
