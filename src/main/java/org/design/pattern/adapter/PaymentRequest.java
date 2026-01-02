package org.design.pattern.adapter;
public class PaymentRequest {
  private final String orderId;
  private final double amount;      // in rupees
  private final String currency;    // "INR"
  private final String customerPhone;

  public PaymentRequest(String orderId, double amount, String currency, String customerPhone) {
    this.orderId = orderId;
    this.amount = amount;
    this.currency = currency;
    this.customerPhone = customerPhone;
  }

  public String getOrderId() { return orderId; }
  public double getAmount() { return amount; }
  public String getCurrency() { return currency; }
  public String getCustomerPhone() { return customerPhone; }
}

