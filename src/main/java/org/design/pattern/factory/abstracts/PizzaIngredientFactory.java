package org.design.pattern.factory.abstracts;

import org.design.pattern.factory.abstracts.ingredients.Cheese;
import org.design.pattern.factory.abstracts.ingredients.Dough;
import org.design.pattern.factory.abstracts.ingredients.Sauce;

public interface PizzaIngredientFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
}
