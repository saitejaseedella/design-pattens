package org.design.pattern.factory.abstracts;

import org.design.pattern.factory.abstracts.store.ChicagoPizzaStore;
import org.design.pattern.factory.abstracts.store.NyPizzaStore;
import org.design.pattern.factory.abstracts.store.PizzaStore;

public class PizzaTestDrive {
  public static void main(String[] args) {

    PizzaStore nyStore = new NyPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    nyStore.orderPizza("cheese");
    System.out.println();
    chicagoStore.orderPizza("cheese");
  }
}

