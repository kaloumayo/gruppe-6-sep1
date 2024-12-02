package com.example.sep1.model;

public class AnimalForSale
{
  private AnimalInformation information;
  private double price;
  private boolean isSold;
  private int dateOfSell;

  public AnimalForSale(double price,
      AnimalInformation information)
  {
    this.isSold = false;
    this.price = price;
    this.information = information;
  }

  public AnimalInformation getInformation()
  {
    return information;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public boolean isSold()
  {
    return isSold;
  }

  public void setSold(boolean sold)
  {
    isSold = sold;
  }

  public int getDateOfSell()
  {
    return dateOfSell;
  }

  public void setDateOfSell(int dateOfSell)
  {
    this.dateOfSell = dateOfSell;
  }
}
