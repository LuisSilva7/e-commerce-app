package org.silva.ecommerce.kafka;

import org.silva.ecommerce.customer.CustomerResponse;
import org.silva.ecommerce.order.PaymentMethod;
import org.silva.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
