
package com.klu.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final BankService bankService;

    public PaymentService(BankService bankService) {
        this.bankService = bankService;
    }

    public boolean validatePayment(double amount, String name) {

        return amount > 0 &&
               name != null &&
               !name.isBlank();
    }

    public String processPayment(Payment payment) {

        if (!validatePayment(
                payment.getAmount(), payment.getName())) {

            return "Payment Failed";
        }

        boolean result =
                bankService.makeTransaction(payment.getAmount());

        if (result) {
            return "Payment Successful";
        }

        return "Payment Failed";
    }
}
