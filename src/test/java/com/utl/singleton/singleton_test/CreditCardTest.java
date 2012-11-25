package com.utl.singleton.singleton_test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CreditCardTest {

    @Mock
    private CreditCardProcessor mockProcessor;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() {
        final CreditCard card = new CreditCard(Month.APRIL, 2012, "1234 4321 1234 4321");
        card.charge(this.mockProcessor, 100);
        
        //Wow!, I am able to test it!
        Mockito.verify(this.mockProcessor).chargeCard(card, 100);
        Mockito.verifyNoMoreInteractions(this.mockProcessor);
    }
}
