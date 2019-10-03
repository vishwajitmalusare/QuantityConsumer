package com.thoughtworks.quantityconsumer;

import com.bridgelabz.quantity.AddableQuantity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityConsumerTest {
    @Test
    void givenZeroCentiMeterAndZeroCentimeterWhenCheckEqualityThenShoulBeEqual() {
        AddableQuantity zeroCentiMeter = new AddableQuantity(0,new CentiMeter());
        AddableQuantity anotherZeroCentiMeter = new AddableQuantity(0, new CentiMeter());

        Assertions.assertTrue(anotherZeroCentiMeter.equals(zeroCentiMeter));
    }
}
