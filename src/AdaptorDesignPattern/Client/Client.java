package AdaptorDesignPattern.Client;

import AdaptorDesignPattern.Adaptee.WeightMachineForBabies;
import AdaptorDesignPattern.Adapter.WeightMachineAdapter;
import AdaptorDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter wma=new WeightMachineAdapterImpl(new WeightMachineForBabies());

        System.out.println(wma.getWeightInKg());
    }
}
