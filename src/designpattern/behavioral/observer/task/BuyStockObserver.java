package designpattern.behavioral.observer.task;

public class BuyStockObserver implements Observer {

    @Override
    public void update(float price) {
        if (price < 95) {
            System.out.println("Buying stock because price is low...");
        }
    }

}
