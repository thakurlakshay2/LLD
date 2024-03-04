package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Stratergy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
