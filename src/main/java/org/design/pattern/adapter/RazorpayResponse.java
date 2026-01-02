package org.design.pattern.adapter;

public class RazorpayResponse {
  private final boolean ok;
  private final String paymentId;
  private final String statusMessage;

  public RazorpayResponse(boolean ok, String paymentId, String statusMessage) {
    this.ok = ok;
    this.paymentId = paymentId;
    this.statusMessage = statusMessage;
  }

  public boolean isOk() { return ok; }
  public String getPaymentId() { return paymentId; }
  public String getStatusMessage() { return statusMessage; }
}
