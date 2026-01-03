package org.design.pattern.templet;

public class CoffeeBeverage extends CaffeineBeverages{

  @Override
  void brew() {
    System.out.println("Brewing Coffee");
  }

  @Override
  void addCondiments() {

    System.out.println("Adding condiments for Coffee");
  }
}
