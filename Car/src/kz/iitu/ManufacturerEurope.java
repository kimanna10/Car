package kz.iitu;

public class ManufacturerEurope implements MovableAdapterEurope, Type {
    private MovableAdapterUS luxuryCars;

    // standard constructors


    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

    @Override
    public String fill() {
        return "Manufactured in Europe";
    }
}
