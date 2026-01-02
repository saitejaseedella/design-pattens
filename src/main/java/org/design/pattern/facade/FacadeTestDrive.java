package org.design.pattern.facade;

public class FacadeTestDrive {
  public static void main(String[] args) {

    CheckoutFacade checkoutFacade = new CheckoutFacade(
        new InventoryService(),
        new PricingService(),
        new PaymentService(),
        new InvoiceService(),
        new NotificationService()
    );

    CheckoutResult res = checkoutFacade.checkout("user-1", "prod-101", 2);

    if (res.isSuccess()) {
      System.out.println("✅ Checkout success: invoice=" + res.getInvoiceId()
          + ", txn=" + res.getTransactionId()
          + ", amount=" + res.getAmount());
    } else {
      System.out.println("❌ Checkout failed: " + res.getError());
    }
  }
}

