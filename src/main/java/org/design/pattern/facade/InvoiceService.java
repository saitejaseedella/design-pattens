package org.design.pattern.facade;

public class InvoiceService {
  public String generateInvoice(String userId, String productId, int qty, double amount, String txnId) {
    return "INV-" + System.nanoTime();
  }
}

