
package com.klu.payment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public String makePayment(@RequestBody Payment payment) {

        return paymentService.processPayment(payment);
    }
}
