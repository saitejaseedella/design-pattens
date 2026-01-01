package org.design.pattern.factory.abstracts.store;

import org.design.pattern.factory.abstracts.PizzaIngredientFactory;
import org.design.pattern.factory.abstracts.chicago.ChicagoPizzaIngredientFactory;
import org.design.pattern.factory.abstracts.pizza.CheesePizza;
import org.design.pattern.factory.abstracts.pizza.Pizza;

// store/ChicagoPizzaStore.java
public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    if ("cheese".equalsIgnoreCase(type)) {
      CheesePizza pizza = new CheesePizza(ingredientFactory);
      pizza.name = "Chicago Style Cheese Pizza";
      return pizza;
    }

    throw new IllegalArgumentException("Unknown pizza type: " + type);
  }

  // Optional: Chicago cuts square slices (Head First detail)
  // You can also override in a ChicagoPizza subclass if you prefer.
}

