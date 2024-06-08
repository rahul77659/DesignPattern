package Decorator;

public class ChocolateChip implements Icecrean{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "ChocolateChip";
    }
}
