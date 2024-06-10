package FactoryDesignPattern.Button;

import org.w3c.dom.ls.LSOutput;

public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size of iOS button");
    }
}
