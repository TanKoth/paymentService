package org.paymentservice.adapter.paymentgatewayadapters.stripe;

import com.stripe.StripeClient;
import com.stripe.model.PaymentLink;
import com.stripe.model.Price;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PriceCreateParams;
import org.paymentservice.adapter.paymentgatewayadapters.PaymentGatewayAdapter;
import org.springframework.stereotype.Service;

@Service
public class StripePaymentGatewayAdapter implements PaymentGatewayAdapter {
    private final StripeClient stripeClient;

    public StripePaymentGatewayAdapter(StripeClient stripeClient) {
        this.stripeClient = stripeClient;
    }


    @Override
    public String createPaymentLink(Long price) throws Exception {
//  ProductCreateParams params =
//   ProductCreateParams.builder()
//     .setDescription("(created by Stripe Shell)")
//     .setName("Scaler Academy Course")
//     .setActive(true)
//     .setDefaultPriceData(
//       ProductCreateParams.DefaultPriceData.builder()
//         .setCurrency("inr")
//         .setUnitAmount(999999L)
//         .build()
//     )
//     .build();

// Product product = Product.create(params);

//PriceCreateParams params =
//                PriceCreateParams.builder()
//                        .setCurrency("inr")
//                        .setActive(true)
//                        .setProduct("prod_R2mEzkGhQ8nrOl")
//                        .setUnitAmount(999999L)
//                        .build();
//
//Price price = Price.create(params);

    PaymentLinkCreateParams params =
    PaymentLinkCreateParams.builder()
            .setCurrency("inr")
            .addLineItem(
                    PaymentLinkCreateParams.LineItem.builder()
                            .setPrice("price_1QAgi6K0PLM9hgomG3ICLwq9")
                            .setQuantity(1L)
                            .build()
            )
            .setAfterCompletion(
                    PaymentLinkCreateParams.AfterCompletion.builder()
                            .setType(PaymentLinkCreateParams.AfterCompletion.Type.REDIRECT)
                            .setRedirect(
                                    PaymentLinkCreateParams.AfterCompletion.Redirect.builder()
                                            .setUrl("https://scaler.com")
                                            .build()
                            )
                            .build()
            )
            .setInvoiceCreation(
                    PaymentLinkCreateParams.InvoiceCreation.builder().setEnabled(true).build()
            )
            .setPhoneNumberCollection(
                    PaymentLinkCreateParams.PhoneNumberCollection.builder().setEnabled(false).build()
            )
            .build();

        PaymentLink paymentLink = PaymentLink.create(params);

        return paymentLink.getUrl();
    }
}
