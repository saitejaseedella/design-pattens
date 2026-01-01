package org.design.pattern.factory.abstracts.ny;

import org.design.pattern.factory.abstracts.PizzaIngredientFactory;
import org.design.pattern.factory.abstracts.ingredients.Cheese;
import org.design.pattern.factory.abstracts.ingredients.Dough;
import org.design.pattern.factory.abstracts.ingredients.Sauce;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override public Dough createDough() { return new NyDough(); }
  @Override public Sauce createSauce() { return new NySauce(); }
  @Override public Cheese createCheese() { return new NyCheese(); }
}