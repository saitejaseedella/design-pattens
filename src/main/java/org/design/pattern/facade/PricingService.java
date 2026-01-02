package org.design.pattern.facade;

public class PricingService {
  public double calculateTotal(String productId, int qty) {
    return 499.0 * qty; // demo
  }
}

