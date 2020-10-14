package kz.iitu;

public class ManufacturerAdapterUS implements MovableAdapterUS, Type {
    private MovableAdapterUS luxuryCars;

    // standard constructors
    @Override
    public double getSpeed() {
        return luxuryCars.getSpeed();
    }

    @Override
    public String fill() {
        return "Manufactured in US";
    }
}