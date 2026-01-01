package org.design.pattern.factory.simple;

public class SimpleFactory {

  public  Product createProduct(String type){
      if(type.equalsIgnoreCase("A")){
          return new ProductA();
      } else if(type.equalsIgnoreCase("B")){
          return new ProductB();
      }
      throw new IllegalArgumentException("Unknown product type: " + type);
  }
}
