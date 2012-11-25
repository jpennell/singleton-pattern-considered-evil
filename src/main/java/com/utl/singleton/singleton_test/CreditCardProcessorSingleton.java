package com.utl.singleton.singleton_test;

public class CreditCardProcessorSingleton {

    private static CreditCardProcessorSingleton INSTANCE = null;

    private boolean isInitialized = false;

    private CreditCardProcessorSingleton() {

    }

    public static CreditCardProcessorSingleton getInstance() {
        if (CreditCardProcessorSingleton.INSTANCE == null) {
            CreditCardProcessorSingleton.INSTANCE = new CreditCardProcessorSingleton();
        }

        return CreditCardProcessorSingleton.INSTANCE;
    }

    public void initialize() {

        // Do some initialization
        this.isInitialized = true;
    }

    public void chargeCard(final CreditCardUsingSingleton creditCardUsingSingleton, final int amount) throws Exception {

        if (!this.isInitialized) {
            throw new Exception();
        }

        System.out.println("[CreditCardProcessorSingleton]: Charging card for real.");
    }
}
