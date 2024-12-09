package org.silva.ecommerce.payment;

import org.silva.ecommerce.customer.CustomerResponse;
import org.silva.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}