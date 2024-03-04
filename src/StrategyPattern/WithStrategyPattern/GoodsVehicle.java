package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Stratergy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
