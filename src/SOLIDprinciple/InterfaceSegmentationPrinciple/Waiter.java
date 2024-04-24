package SOLIDprinciple.InterfaceSegmentationPrinciple;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() { //this part is useless
        //not my job
    }

    @Override
    public void serveCustomers() { //actually useful to sever

    }

    @Override
    public void cookFood() {  // this part is useless
        //not my job
    }
}
