package AbstractFactoryPattern;

public class AffordableFactory implements VehicleFactory {
    final static int SWIFT=1;
    final static int NEXON=2;
    @Override
    public Vehicle getVehicle(int type) {
        return switch (type){
            case SWIFT ->  new swift();
            case NEXON -> new nexon();
            default -> null;
        };
    }
}
