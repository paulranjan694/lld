package observerpattern.observers;


import observerpattern.observables.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver {
    String username;
    StockObservable stockObservable;

    public EmailNotificationObserverImpl(StockObservable stockObservable, String username) {
        this.stockObservable = stockObservable;
        this.username = username;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending Email to " + username);
    }
}
