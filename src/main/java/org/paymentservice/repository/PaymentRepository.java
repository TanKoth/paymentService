package org.paymentservice.repository;

import org.paymentservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment save(Payment payment);

    //Payment findByPaymentGatewayReferenceId(String paymentGatewayReferenceId);
}
