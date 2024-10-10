package observer_pattern.observers;

import observer_pattern.observables.StockObservable;

public class SMSNotificationObserverImpl implements NotificationObserver {
    String username;
    StockObservable stockObservable;

    public SMSNotificationObserverImpl(StockObservable stockObservable, String username) {
        this.stockObservable = stockObservable;
        this.username = username;
    }

    @Override
    public void update() {
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("Sending SMS to " + username);
    }
}
