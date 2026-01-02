package org.design.pattern.adapter;

public class AdapterTestDrive {
  public static void main(String[] args) {
    RazorpaySdk sdk = new RazorpaySdk();
    PaymentGateway gateway = new RazorpayGatewayAdapter(sdk);

    CheckoutService checkout = new CheckoutService(gateway);

    checkout.checkout("ORD-101", 499.0, "9876543210");
    checkout.checkout("ORD-102", 0.0, "9876543210");
  }
}
