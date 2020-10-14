package kz.iitu;

public class Minivan extends Car implements MovableAdapterUS {

    public Minivan(Type type) {
        super(type);
    }

    @Override
    public String draw() {
        return "Minivan drawn. " + type.fill();
    }

    @Override
    public double getSpeed() {
        return 452;
    }
}
