package org.design.pattern.factory.abstracts.pizza;

import org.design.pattern.factory.abstracts.PizzaIngredientFactory;

// pizza/CheesePizza.java
public class CheesePizza extends Pizza {

  private final PizzaIngredientFactory ingredientFactory;

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);

    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();

    System.out.println(" - Dough: " + dough.name());
    System.out.println(" - Sauce: " + sauce.name());
    System.out.println(" - Cheese: " + cheese.name());
  }
}
