package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;

public class IphoneObservableImpl implements  StocksObservable{
    private ArrayList<NotificationAlertObserver> observerList=new ArrayList<>();
    private int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) { observerList.add(observer);}

    @Override
    public void remove(NotificationAlertObserver observer) { observerList.remove(observer);}

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver observer1: observerList){
            observer1.update();
        }
    }
    public void setStockCount(int newStockAdded ) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=stockCount+newStockAdded;
    }
    public int getStockCount() {
        return stockCount;
    }

}
