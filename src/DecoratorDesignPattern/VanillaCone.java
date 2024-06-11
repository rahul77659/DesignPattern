package Decorator;

import DecoratorDesignPattern.IceCreamConeConstituents;

public class VanillaCone implements IceCreamConeConstituents {
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Vanilla COne";
    }
}
