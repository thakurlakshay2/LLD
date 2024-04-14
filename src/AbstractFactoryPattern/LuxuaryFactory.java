package AbstractFactoryPattern;

public class LuxuaryFactory implements VehicleFactory {
    final static int BUGATI=1;

    @Override
    public Vehicle getVehicle(int type) {
        return switch (type){
            case BUGATI ->  new swift();
            default -> null;
        };
    }
}
