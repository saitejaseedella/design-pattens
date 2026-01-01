package org.design.pattern.factory.abstracts.pizza;

import org.design.pattern.factory.abstracts.ingredients.Cheese;
import org.design.pattern.factory.abstracts.ingredients.Dough;
import org.design.pattern.factory.abstracts.ingredients.Sauce;

public abstract class Pizza {
  public String name;

  protected Dough dough;
  protected Sauce sauce;
  protected Cheese cheese;

  public String getName() { return name; }

  public abstract void prepare();

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official box");
  }
}

