package org.design.pattern.factory.abstracts.chicago;

import org.design.pattern.factory.abstracts.ingredients.Dough;

public class ChicagoDough implements Dough {
  @Override public String name() { return "Thick Crust Dough"; }
}
