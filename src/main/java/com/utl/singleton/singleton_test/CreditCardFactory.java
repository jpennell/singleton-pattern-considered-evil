package com.utl.singleton.singleton_test;

public class CreditCardFactory {

    private static CreditCardProcessor creditCardProcessor = new CreditCardProcessor();

    public static CreditCardProcessor getCreditCardProcessor() {
        return CreditCardFactory.creditCardProcessor;
    }
}
