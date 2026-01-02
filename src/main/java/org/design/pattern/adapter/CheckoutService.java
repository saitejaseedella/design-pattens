package org.design.pattern.adapter;

public class CheckoutService {
  private final PaymentGateway paymentGateway;

  public CheckoutService(PaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public void checkout(String orderId, double amount, String phone) {
    PaymentRequest req = new PaymentRequest(orderId, amount, "INR", phone);

    PaymentResult result = paymentGateway.charge(req);

    if (result.isSuccess()) {
      System.out.println("✅ Payment success, txId=" + result.getTransactionId());
    } else {
      System.out.println("❌ Payment failed: " + result.getMessage());
    }
  }
}
