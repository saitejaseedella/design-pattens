package org.design.pattern.templet;

import org.design.pattern.decorator.Beverage;

public class TeaBeverage extends CaffeineBeverages {

  @Override
  void brew() {
    System.out.println("Brewing tea bag in hot water");
  }

  @Override
  void addCondiments() {
      System.out.println("Adding condiments for tea");
  }
}
