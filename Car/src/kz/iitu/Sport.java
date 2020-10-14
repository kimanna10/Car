package kz.iitu;

public class Sport extends Car implements MovableAdapterUS{
    public Sport(Type type) {
        super(type);
    }

    @Override
    public String draw() {
        return "Sport drawn. " + type.fill();
    }

    @Override
    public double getSpeed() {
        return 142;
    }
}
