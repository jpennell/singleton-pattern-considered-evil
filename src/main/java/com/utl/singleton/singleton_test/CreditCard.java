package com.utl.singleton.singleton_test;

public class CreditCard {

    private final Month expiryMonth;

    private final int expiryYear;

    private final String cardNumber;

    public CreditCard(final Month expiryMonth, final int expiryYear, final String cardNumber) {
        super();
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cardNumber = cardNumber;
    }
    
    public void charge(CreditCardProcessor processor, int amount) {
        processor.chargeCard(this, amount);
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getExpiryYear() {
        return this.expiryYear;
    }

    public Month getExpiryMonth() {
        return this.expiryMonth;
    }

}
