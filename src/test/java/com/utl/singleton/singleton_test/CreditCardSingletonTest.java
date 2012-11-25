package com.utl.singleton.singleton_test;

import org.junit.Test;

public class CreditCardSingletonTest {

    @Test
    public void test() throws Exception {
        final CreditCardUsingSingleton card = new CreditCardUsingSingleton(Month.APRIL, 2012, "1234 4321 1234 4321");

        // This will fail because I have no way of mocking out the
        // CreditCardSingleton class
        // it is a dependency of CreditCardUsingSingleton, but it didn't tell me
        // in its constructor
        card.charge(100);
    }

    @Test
    public void testWithInitialization() throws Exception {

        // Even if I know that I have to initialize CreditCardProcessorSingleton
        // such that this test will "pass" (if you can call it that) this is no
        // longer testing a unit, since I'm dealing
        // with both CreditCardUsingSingleton and CreditCardProcessorSingleton
        CreditCardProcessorSingleton.getInstance().initialize();

        final CreditCardUsingSingleton card = new CreditCardUsingSingleton(Month.APRIL, 2012, "1234 4321 1234 4321");

        card.charge(100);

        // The implementation of CreditCardProcessor and
        // CreditCardProcessorSingleton is just: System.out.println("...."), if
        // you check the output after running this test
        // you'll notice that the singleton version would have charged the
        // credit card for real and I have no way of
        // stopping that here - whereas the better, non-Singleton implementation
        // did not charge the credit card for real
    }
}
