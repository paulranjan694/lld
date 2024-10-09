package observerpattern.observables;

import observerpattern.observers.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver observer); //register observer/subscribe to observable
    public void remove(NotificationObserver observer);//de-register observer/un-subscribe to observable
    public void notifySubscriber();//notify subscribed observers
    public void setStockData(int stockQuantity);
    public int getDate();
}
