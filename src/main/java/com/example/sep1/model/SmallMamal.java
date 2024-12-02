package com.example.sep1.model;

import java.time.LocalDate;

public class SmallMamal extends AnimalInformation
{
  private String race;

  public SmallMamal(boolean isMale, LocalDate birthday, String name, String race)
  {
    super(isMale, birthday, name);
    this.race = race;
  }

  public String getRace()
  {
    return race;
  }

  public void setRace(String race)
  {
    this.race = race;
  }

}
