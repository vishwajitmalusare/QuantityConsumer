package com.thoughtworks.quantityconsumer;


import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.UnitInterface;
import com.bridgelabz.quantity.length.Inch;

public class CentiMeter implements UnitInterface {

    private double converter = 2.54;
    @Override
    public AddableQuantity convertToBase(double value) {
        return new AddableQuantity(value * 1/converter,new Inch());
    }
    public boolean equals(Object object) {
        return object instanceof CentiMeter;
    }

}
