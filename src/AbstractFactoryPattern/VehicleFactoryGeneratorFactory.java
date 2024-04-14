package AbstractFactoryPattern;

public class VehicleFactoryGeneratorFactory {
    final static int PERMIUM=1;
    final static int AFFORDABLE=2;
    public VehicleFactory getFactory(int vehicleType){
        return switch (vehicleType){
            case PERMIUM -> new LuxuaryFactory();
            case AFFORDABLE -> new AffordableFactory();
            default -> null;
        };
    }
}
