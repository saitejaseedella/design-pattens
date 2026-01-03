package org.design.pattern.templet;

public abstract class CaffeineBeverages {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  abstract void brew();

  abstract void addCondiments();

  void boilWater() {
    System.out.println("Boiling water");
  }

  void pourInCup() {
    System.out.println("Pouring into cup");
  }

  // Hook method
  boolean customerWantsCondiments() {
    return true;
  }
}
