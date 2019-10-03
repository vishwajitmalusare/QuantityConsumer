package com.thoughtworks.quantityconsumer;

import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.length.Inch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityConsumerTest {
    @Test
    void givenZeroCentiMeterAndZeroCentimeterWhenCheckEqualityThenShoulBeEqual() {
        AddableQuantity zeroCentiMeter = new AddableQuantity(0,new CentiMeter());
        AddableQuantity anotherZeroCentiMeter = new AddableQuantity(0, new CentiMeter());

        assertTrue(anotherZeroCentiMeter.equals(zeroCentiMeter));
    }

    @Test
    void givenOneInchAndTwoPointFiveFourCentimeterWhenCheckEqualsThenShouldBeEqual() {
        AddableQuantity oneInch = new AddableQuantity(1,new Inch());
        AddableQuantity twoPointFiveFourCM = new AddableQuantity(2.54,new CentiMeter());

        assertTrue(oneInch.equals(twoPointFiveFourCM));
    }

    @Test
    void givenTwoInchAndTwoPointFiveFourCentiMeterWhenAddThenShouldBeAdded() {
        AddableQuantity twoInch = new AddableQuantity(2,new Inch());
        AddableQuantity twoPointFiveFourCM = new AddableQuantity(2.54,new CentiMeter());

        assertEquals(new AddableQuantity(3.0,new Inch()),twoInch.add(twoPointFiveFourCM));
    }
}
