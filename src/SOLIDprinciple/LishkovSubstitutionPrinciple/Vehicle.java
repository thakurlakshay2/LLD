package SOLIDprinciple.LishkovSubstitutionPrinciple;

public class Vehicle {

    public int numberOfWheels(){
        return 2;
    }
    //TO avoid issues , put very generic methods which are common to all
    //like in cycles there is no engine, and in EV there is a motor.
    //better approach would be to have a different interface like "DrivingMechanism" , which will be
    // implemented by mechanical clas , engine class , motor class..
    public Boolean hasEngine(){
        return true;
    }
}
