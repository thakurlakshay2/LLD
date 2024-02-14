package WithStrategyPattern;

import WithStrategyPattern.Stratergy.DriveStrategy;
import WithStrategyPattern.Stratergy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
