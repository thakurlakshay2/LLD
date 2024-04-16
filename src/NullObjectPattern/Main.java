package NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vf=new VehicleFactory();

        System.out.println(vf.getVehicle("CAR").getSeatingCapacity());
        System.out.println(vf.getVehicle("daodi").getSeatingCapacity());
    }
}
