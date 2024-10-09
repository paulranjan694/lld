package observerpattern;

import observerpattern.observables.IPhoneStockObservableImpl;
import observerpattern.observables.StockObservable;
import observerpattern.observers.EmailNotificationObserverImpl;
import observerpattern.observers.NotificationObserver;
import observerpattern.observers.SMSNotificationObserverImpl;

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
