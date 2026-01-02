package org.design.pattern.adapter;

// Imagine this is a 3rd-party SDK you cannot change
public class RazorpaySdk {

  // amount is paise, not rupees
  public RazorpayResponse pay(long amountInPaise, String phone, String note) {
    // Fake response for demo
    if (amountInPaise <= 0) {
      return new RazorpayResponse(false, null, "Invalid amount");
    }
    return new RazorpayResponse(true, "rzp_txn_" + System.nanoTime(), "Payment successful");
  }
}
