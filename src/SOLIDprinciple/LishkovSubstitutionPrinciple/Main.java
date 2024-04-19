package SOLIDprinciple.LishkovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;


//LIShKOV principle suggests- that a child/subclass should enhance the capabilites of parent class not hamper them.
//in bottom example bycicle does exacly that.
//
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bike());
        vehicleList.add(new BiCicle()); // null point exception error
        for(Vehicle v:vehicleList){
            System.out.println(v.hasEngine().toString());
        }
    }
}
