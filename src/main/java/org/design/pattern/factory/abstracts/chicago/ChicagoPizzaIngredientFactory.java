package org.design.pattern.factory.abstracts.chicago;

import org.design.pattern.factory.abstracts.PizzaIngredientFactory;
import org.design.pattern.factory.abstracts.ingredients.Cheese;
import org.design.pattern.factory.abstracts.ingredients.Dough;
import org.design.pattern.factory.abstracts.ingredients.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override public Dough createDough() { return new ChicagoDough(); }
  @Override public Sauce createSauce() { return new ChicagoSauce(); }
  @Override public Cheese createCheese() { return new ChicagoCheese(); }
}
