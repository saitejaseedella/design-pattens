package org.design.pattern.decorator;

public abstract class CondimentDecorator extends Beverage {
  Beverage beverage;
  public abstract String getDescription();


}
