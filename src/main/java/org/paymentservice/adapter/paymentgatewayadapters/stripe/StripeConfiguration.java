package org.paymentservice.adapter.paymentgatewayadapters.stripe;

import com.stripe.Stripe;
import com.stripe.StripeClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfiguration {
    @Value("${STRIPE_API_KEY}")
    private String stripeSecretKey;

    @Bean
    public StripeClient getStripeClient(){
        Stripe.apiKey = stripeSecretKey;
        return new StripeClient(stripeSecretKey);
    }
}
