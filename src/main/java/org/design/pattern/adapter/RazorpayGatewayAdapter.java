package org.design.pattern.adapter;

public class RazorpayGatewayAdapter implements PaymentGateway {

  private final RazorpaySdk razorpaySdk;

  public RazorpayGatewayAdapter(RazorpaySdk razorpaySdk) {
    this.razorpaySdk = razorpaySdk;
  }

  @Override
  public PaymentResult charge(PaymentRequest request) {

    if (!"INR".equalsIgnoreCase(request.getCurrency())) {
      return PaymentResult.failure("Razorpay adapter supports only INR");
    }

    long amountInPaise = Math.round(request.getAmount() * 100); // rupees -> paise
    String note = "orderId=" + request.getOrderId();

    RazorpayResponse resp = razorpaySdk.pay(amountInPaise, request.getCustomerPhone(), note);

    if (resp.isOk()) {
      return PaymentResult.success(resp.getPaymentId());
    }
    return PaymentResult.failure(resp.getStatusMessage());
  }
}

