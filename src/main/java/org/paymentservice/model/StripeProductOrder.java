package org.paymentservice.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StripeProductOrder extends BaseModel {
    private Long productId;
    private String stripePriceId;
    private String stripeProductId;
}
