package org.design.pattern.facade;

public class InventoryService {
  public boolean isInStock(String productId, int qty) {
    return qty > 0; // demo
  }
}

