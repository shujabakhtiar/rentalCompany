package Truck;

public interface Vehicle {
    public String getRegistrationNumber();
    public int getFuelCapacity();
    public int getFuelLevel();
    public boolean isTankFull();
    public int addFuel(int litres);
    public int drive(int distance);
}