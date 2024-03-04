package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    StocksObservable observable;

    String userName;
    public  MobileAlertObserverImpl(String emailId,StocksObservable observable){
        this.observable=observable;
        this.userName=emailId;
    }


    @Override
    public void update(){
        sendMsgOnMobile(userName,"product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName,String msg){
        System.out.println("msg sent to:" + userName);
    }
}
