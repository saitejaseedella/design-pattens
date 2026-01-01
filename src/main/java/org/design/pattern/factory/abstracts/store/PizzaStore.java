package org.design.pattern.factory.abstracts.store;

import org.design.pattern.factory.abstracts.pizza.Pizza;

// store/PizzaStore.java
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);

    System.out.println("---- Making a " + pizza.getName() + " ----");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  // Factory Method (variation point)
  protected abstract Pizza createPizza(String type);
}

