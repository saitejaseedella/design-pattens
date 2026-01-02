package org.design.pattern.facade;

public class NotificationService {
  public void sendConfirmation(String userId, String invoiceId) {
    System.out.println("✅ Sent confirmation to user=" + userId + " for invoice=" + invoiceId);
  }
}

