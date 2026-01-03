package org.design.pattern.templet;

public class DriveTemplet {
  public static void main(String[] args) {
    CaffeineBeverages tea = new TeaBeverage();
    tea.prepareRecipe();

    System.out.println("****************");

    CaffeineBeverages coffee = new CoffeeBeverage();
    coffee.prepareRecipe();
  }
}
