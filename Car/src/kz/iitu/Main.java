package kz.iitu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car minivan = new Minivan(new ManufacturerEurope());
        Car minivan1 = new Minivan(new ManufacturerAdapterUS());
        Car sedan = new Sedan(new ManufacturerEurope());
        Car sedan1 = new Sedan(new ManufacturerAdapterUS());
        Car sport = new Sport(new ManufacturerEurope());
        Car sport1 = new Sport(new ManufacturerAdapterUS());

    }


}
