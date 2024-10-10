package observer_pattern.observables;

import observer_pattern.observers.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservableImpl implements StockObservable {
    private int quantity;
    List<NotificationObserver> observerList = new ArrayList<>();
    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockData(int stockQuantity) {
        if(quantity == 0) {
            quantity = stockQuantity;
            notifySubscriber();
        }
    }

    @Override
    public int getDate() {
        return quantity;
    }
}
