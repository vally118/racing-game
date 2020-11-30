package org.example;

public class Autovehicle extends Vehicle{

    private Engine engine;
    private double mileage;

    public Autovehicle (Engine engine) {
        this.engine = engine;
        System.out.println();

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}

