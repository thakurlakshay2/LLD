package WithStrategyPattern;

import WithStrategyPattern.Stratergy.DriveStrategy;
import WithStrategyPattern.Stratergy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
