package org.paymentservice.service;

import org.paymentservice.adapter.paymentgatewayadapters.PaymentGatewayAdapter;
import org.paymentservice.adapter.paymentgatewayadapters.PaymentGatewayStrategy;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewayStrategy paymentGatewayStrategy;

    public PaymentService(PaymentGatewayStrategy paymentGatewayStrategy) {
        this.paymentGatewayStrategy = paymentGatewayStrategy;
    }

    public String createPaymentLink(Long orderId)  {
        //1. Get order details fom order service
        // restTemplate.getForObject("http://localhost:8080/order/" + orderId, OrderDto.class); this from orderservice which is another microservice

        Long price = 123L;

        //2. get a payment gateway based on the strategy
        PaymentGatewayAdapter paymentGatewayAdapter = paymentGatewayStrategy.getPaymentGateway();
        //3. call payment gateway to create a payment link
        String url ="";
        try{
            url = paymentGatewayAdapter.createPaymentLink(price);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //4. return the payment link
        return url;
    }
}
