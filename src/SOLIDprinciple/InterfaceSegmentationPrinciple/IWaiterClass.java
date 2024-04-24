package SOLIDprinciple.InterfaceSegmentationPrinciple;

public class IWaiterClass implements IWaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("i serve customers");
    }

    @Override
    public void takeOrders() {
        System.out.println("Taking orders");
    }
}
