package Rental;
import java.util.HashMap;
import java.util.Map;

import Person.Person;
import Truck.Truck;

public class Rent {
    private Person person;
    private Truck truck;
    private int fuelLevel;

    public Rent(Person person, Truck truck, int fuelLevel) {
        this.person = person;
        this.truck = truck;
        this.fuelLevel = fuelLevel;
    }

    public Person getPerson() {
        return person;
    }

    public Truck getTruck() {
        return truck;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
