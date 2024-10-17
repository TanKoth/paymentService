package org.paymentservice.adapter.paymentgatewayadapters;

import org.paymentservice.adapter.paymentgatewayadapters.razorpay.RazorpayPaymentGatewayAdapter;
import org.paymentservice.adapter.paymentgatewayadapters.stripe.StripePaymentGatewayAdapter;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentGatewayStrategy {

    private StripePaymentGatewayAdapter stripePaymentGatewayAdapter;

    public PaymentGatewayStrategy(StripePaymentGatewayAdapter stripePaymentGatewayAdapter) {
        this.stripePaymentGatewayAdapter = stripePaymentGatewayAdapter;
    }

    public PaymentGatewayAdapter getPaymentGateway(){

        return stripePaymentGatewayAdapter;

//        int isEven = new Random().nextInt(100);
//        if(isEven % 2 == 0){
//            return new RazorpayPaymentGatewayAdapter();
//
//        }else{
//            return new StripePaymentGatewayAdapter();
//        }
    }

}
