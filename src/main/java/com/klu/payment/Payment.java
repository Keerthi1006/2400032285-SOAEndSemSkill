
package com.klu.payment;

public class Payment {

    private int paymentId;
    private double amount;
    private String name;

    public Payment(int paymentId, double amount, String name) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.name = name;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
