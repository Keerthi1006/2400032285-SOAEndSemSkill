
package com.klu.payment;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public boolean makeTransaction(double amount) {

        if (amount <= 10000) {
            return true;
        }

        return false;
    }
}
