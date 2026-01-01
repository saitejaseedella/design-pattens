package org.design.pattern.factory.abstracts.store;

import org.design.pattern.factory.abstracts.PizzaIngredientFactory;
import org.design.pattern.factory.abstracts.ny.NyPizzaIngredientFactory;
import org.design.pattern.factory.abstracts.pizza.CheesePizza;
import org.design.pattern.factory.abstracts.pizza.Pizza;

// store/NyPizzaStore.java
public class NyPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

    if ("cheese".equalsIgnoreCase(type)) {
      CheesePizza pizza = new CheesePizza(ingredientFactory);
      pizza.name = "NY Style Cheese Pizza";
      return pizza;
    }

    throw new IllegalArgumentException("Unknown pizza type: " + type);
  }
}

