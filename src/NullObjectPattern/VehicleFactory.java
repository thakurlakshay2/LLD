package NullObjectPattern;



public class VehicleFactory {



    Vehicle getVehicle(String shapeType){
        return switch (shapeType) {
            case "CAR" -> new Car();
            case "NULL" -> new NullVehicle();
            default -> new NullVehicle();
        };
    }
}
