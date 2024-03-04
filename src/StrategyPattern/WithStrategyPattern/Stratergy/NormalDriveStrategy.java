package StrategyPattern.WithStrategyPattern.Stratergy;

public class NormalDriveStrategy  implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("Normal Drive Capability");
    }
}
