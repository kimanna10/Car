package kz.iitu;

public class Sedan extends Car implements MovableAdapterUS{

    public Sedan(Type type) {
        super(type);
    }

    @Override
    public String draw() {
        return "Sedan drawn. " + type.fill();
    }

    @Override
    public double getSpeed() {
        return 422;
    }
}
