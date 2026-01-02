package org.design.pattern.facade;

public class CheckoutResult {
  private final boolean success;
  private final String invoiceId;
  private final String transactionId;
  private final double amount;
  private final String error;

  private CheckoutResult(boolean success, String invoiceId, String transactionId, double amount, String error) {
    this.success = success;
    this.invoiceId = invoiceId;
    this.transactionId = transactionId;
    this.amount = amount;
    this.error = error;
  }

  public static CheckoutResult success(String invoiceId, String txnId, double amount) {
    return new CheckoutResult(true, invoiceId, txnId, amount, null);
  }

  public static CheckoutResult failure(String error) {
    return new CheckoutResult(false, null, null, 0.0, error);
  }

  public boolean isSuccess() { return success; }
  public String getInvoiceId() { return invoiceId; }
  public String getTransactionId() { return transactionId; }
  public double getAmount() { return amount; }
  public String getError() { return error; }
}

