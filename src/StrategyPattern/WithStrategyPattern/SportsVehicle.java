package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Stratergy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportDriveStrategy());
    }


}
