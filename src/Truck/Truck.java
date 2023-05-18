package Truck;

public abstract class Truck implements Vehicle {
    private String registrationNumber;
    private int fuelCapacity;
    protected int fuelLevel;
    

    public Truck(String registrationNumber, int fuelCapacity) {
        this.registrationNumber = registrationNumber;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelCapacity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public boolean isTankFull() {
        return fuelLevel == fuelCapacity;
    }
    // check this implementation
    public int addFuel(int litres) {
        int litresAdded = Math.min(litres, fuelCapacity - fuelLevel);
        fuelLevel += litresAdded;
        return litresAdded;
    }
    //check this implementation
    public abstract int drive(int distance);
}