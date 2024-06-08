package Decorator;

public class ChocolateScoop implements Icecrean{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Vanilla COne";
    }
}
