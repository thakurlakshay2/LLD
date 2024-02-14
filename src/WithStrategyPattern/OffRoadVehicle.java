package WithStrategyPattern;

import WithStrategyPattern.Stratergy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
