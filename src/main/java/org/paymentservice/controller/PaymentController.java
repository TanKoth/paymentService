package org.paymentservice.controller;

import org.paymentservice.dto.CreatePaymentLinkRequestDto;
import org.paymentservice.dto.CreatePaymentLinkResponseDto;
import org.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping()
    public CreatePaymentLinkResponseDto createPaymentLink(@RequestBody CreatePaymentLinkRequestDto request)  {
            String url = paymentService.createPaymentLink(request.getOrderId());
            CreatePaymentLinkResponseDto response = new CreatePaymentLinkResponseDto();
            if (url != null) {
                response.setUrl(url);
            }
            return response;
    }
}
