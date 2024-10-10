package observer_pattern;

import observer_pattern.observables.IPhoneStockObservableImpl;
import observer_pattern.observables.StockObservable;
import observer_pattern.observers.EmailNotificationObserverImpl;
import observer_pattern.observers.NotificationObserver;
import observer_pattern.observers.SMSNotificationObserverImpl;

public class Store {
    public static void main(String[] args) {
        StockObservable iPhoneStockObservable = new IPhoneStockObservableImpl();

        NotificationObserver observer1 = new EmailNotificationObserverImpl(iPhoneStockObservable,"user1");
        NotificationObserver observer2 = new EmailNotificationObserverImpl(iPhoneStockObservable,"user2");
        NotificationObserver observer3 = new SMSNotificationObserverImpl(iPhoneStockObservable,"user3");

        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);
        iPhoneStockObservable.add(observer3);

        iPhoneStockObservable.setStockData(10);
        iPhoneStockObservable.setStockData(0);
        iPhoneStockObservable.setStockData(10);
    }
}
