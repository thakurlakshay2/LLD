package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Stratergy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;
     

    public Vehicle(DriveStrategy obj) {
        this.driveObject = obj;
    }

    public void drive(){
        driveObject.drive();
    }

}
