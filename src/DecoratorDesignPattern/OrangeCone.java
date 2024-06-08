package Decorator;

public class OrangeCone implements Icecrean{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange COne";
    }
}
