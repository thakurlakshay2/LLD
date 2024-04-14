package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactoryGeneratorFactory vfgf=new VehicleFactoryGeneratorFactory();
        VehicleFactory premiumVehiclesFactor=vfgf.getFactory(VehicleFactoryGeneratorFactory.PERMIUM);
        premiumVehiclesFactor.getVehicle(LuxuaryFactory.BUGATI);

    }
}
