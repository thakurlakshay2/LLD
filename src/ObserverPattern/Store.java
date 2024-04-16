package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObs=new IphoneObservableImpl();

        NotificationAlertObserver obs1=new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObs);
        NotificationAlertObserver obs2=new EmailAlertObserverImpl("xyz2@gmail.com",iphoneStockObs);
        NotificationAlertObserver obs3=new MobileAlertObserverImpl("xyz3@gmail.com",iphoneStockObs);
        NotificationAlertObserver obs4=new MobileAlertObserverImpl("xyz3@gmail.com",iphoneStockObs);
        NotificationAlertObserver obs5=new MobileAlertObserverImpl("xyz3@gmail.com",iphoneStockObs);

        iphoneStockObs.add(obs1);
        iphoneStockObs.add(obs2);
        iphoneStockObs.add(obs3);

        //mail sent one time
        iphoneStockObs.setStockCount(10);
        iphoneStockObs.setStockCount(0);
        iphoneStockObs.setStockCount(10);

    }
}

