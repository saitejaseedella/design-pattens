package org.design.pattern.adapter;

public interface PaymentGateway {
  PaymentResult charge(PaymentRequest request);
}

