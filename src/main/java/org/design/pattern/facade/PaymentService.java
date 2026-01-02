package org.design.pattern.facade;

public class PaymentService {
  public String pay(String userId, double amount) {
    if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
    return "TXN-" + System.nanoTime();
  }
}
