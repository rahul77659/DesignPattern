package ObserverDesignPattern.Flipkart;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;

    public static Flipkart getInstance() {
        if (instance == null) {
            instance = new Flipkart();
        }

        return instance;
    }

    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();


    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    void unregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
///event
    public void orderPlaced() {
        // an.notify()
        // ig.generateInvoice()
        // es.send()
        //Amamzon logic goes here

        for (OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
            orderPlacedSubscriber.onOrderPlaced();
        }
    }
}
