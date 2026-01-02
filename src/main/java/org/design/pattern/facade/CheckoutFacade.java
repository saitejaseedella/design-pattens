package org.design.pattern.facade;

public class CheckoutFacade {

  private final InventoryService inventoryService;
  private final PricingService pricingService;
  private final PaymentService paymentService;
  private final InvoiceService invoiceService;
  private final NotificationService notificationService;

  public CheckoutFacade(InventoryService inventoryService,
      PricingService pricingService,
      PaymentService paymentService,
      InvoiceService invoiceService,
      NotificationService notificationService) {
    this.inventoryService = inventoryService;
    this.pricingService = pricingService;
    this.paymentService = paymentService;
    this.invoiceService = invoiceService;
    this.notificationService = notificationService;
  }

  public CheckoutResult checkout(String userId, String productId, int qty) {

    if (!inventoryService.isInStock(productId, qty)) {
      return CheckoutResult.failure("Out of stock");
    }

    double total = pricingService.calculateTotal(productId, qty);

    String txnId;
    try {
      txnId = paymentService.pay(userId, total);
    } catch (Exception e) {
      return CheckoutResult.failure("Payment failed: " + e.getMessage());
    }

    String invoiceId = invoiceService.generateInvoice(userId, productId, qty, total, txnId);

    notificationService.sendConfirmation(userId, invoiceId);

    return CheckoutResult.success(invoiceId, txnId, total);
  }
}
