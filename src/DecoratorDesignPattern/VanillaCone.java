package Decorator;

public class VanillaCone implements Icecrean{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Vanilla COne";
    }
}
