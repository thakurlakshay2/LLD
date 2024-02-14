package WithoutStrategyPattern;

public class OffRoadVehicle extends  Vehicle{

    //code duplicacy with sports vehicle
    @Override
    public void drive(){
        System.out.println("Sports drive capablity");
    }
}
