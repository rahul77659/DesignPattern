package Decorator;

public class ChocolateCone implements Icecrean{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Chocolate COne";
    }
}
