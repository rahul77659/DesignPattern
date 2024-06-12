package ObserverDesignPattern.Flipkart;
public class AnalyticsSender implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    public AnalyticsSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Updating analaytics");
        return null;
    }

    @Override
    public void announceOrderCancelled() {

    }
}