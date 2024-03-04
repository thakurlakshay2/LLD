package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Stratergy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
