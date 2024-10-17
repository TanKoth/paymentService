package org.paymentservice.dto;

import lombok.Getter;
import lombok.Setter;
import org.paymentservice.model.PaymentGateway;
import org.paymentservice.model.PaymentStatus;


@Getter
@Setter
public class CreatePaymentLinkResponseDto {

    private String url;
}
