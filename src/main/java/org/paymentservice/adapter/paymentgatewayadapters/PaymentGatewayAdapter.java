package org.paymentservice.adapter.paymentgatewayadapters;

public interface PaymentGatewayAdapter {

    String createPaymentLink(Long price) throws Exception;
}
