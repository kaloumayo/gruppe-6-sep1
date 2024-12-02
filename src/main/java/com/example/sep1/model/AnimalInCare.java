package com.example.sep1.model;

public class AnimalInCare
{
  private AnimalInformation information;
  private double price;
  private boolean status;
  private String name;
  private String comment;

  public AnimalInCare(AnimalInformation information, double price,
      boolean status, String name, String comment)
  {
    this.information = information;
    this.price = price;
    this.status = status;
    this.name = name;
    this.comment = comment;
  }

  public AnimalInformation getInformation()
  {
    return information;
  }

  public void setInformation(AnimalInformation information)
  {
    this.information = information;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public boolean isStatus()
  {
    return status;
  }

  public void setStatus(boolean status)
  {
    this.status = status;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getComment()
  {
    return comment;
  }

  public void setComment(String comment)
  {
    this.comment = comment;
  }
}
