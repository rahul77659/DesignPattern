package FactoryDesignPattern.Button;


public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size of android button");
    }
}