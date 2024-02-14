package WithStrategyPattern;

import WithStrategyPattern.Stratergy.DriveStrategy;
import WithStrategyPattern.Stratergy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportDriveStrategy());
    }


}
