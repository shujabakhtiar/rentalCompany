package Rental;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Person.Person;
import Truck.Truck;

public class RentalCompany {
    private Map<String, Truck> trucks;
    private Map<Person, RentalRecord> rentals;
    
    public RentalCompany() {
        this.trucks = new HashMap<String, Truck>();
        this.rentals = new HashMap<Person, RentalRecord>();
    }
    public static void registerTruck() {
    	System.out.println("TRUCK ADDED");
    }
    public void addTruck(Truck truck) {
        this.trucks.put(truck.getRegistrationNumber(), truck);
    }

    /*public int availableTrucks(String typeOfTruck) {
        int available = 0;
        for (Truck truck : trucks.values()) {
            if (truck.isAvailable() && truck.getType().equals(typeOfTruck)) {
                available++;
            }
        }
        return available;
    }*/

    public Collection<RentalRecord> getRentedTrucks() {
        return rentals.values();
    }

    public Truck getTruck(Person person) {
        RentalRecord rentalRecord = rentals.get(person);
        if (rentalRecord != null) {
            return rentalRecord.getTruck();
        } else {
            return null;
        }
    }

   /* public int issueTruck(Person person, DrivingLicence drivingLicence, String typeOfTruck) {
        if (!drivingLicence.isFull()) {
            return ISSUE_FAIL_NOT_FULL_LICENCE;
        } else if (getTruck(person) != null) {
            return ISSUE_FAIL_ALREADY_RENTING;
        } else if (typeOfTruck.equals(SMALL_TRUCK) && (drivingLicence.getAge() < 20 || drivingLicence.getYearsHeld() < 1)) {
            return ISSUE_FAIL_SMALL_TRUCK_AGE_OR_YEARS;
        } else if (typeOfTruck.equals(LARGE_TRUCK) && (drivingLicence.getAge() < 25 || drivingLicence.getYearsHeld() < 5)) {
            return ISSUE_FAIL_LARGE_TRUCK_AGE_OR_YEARS;
        } else if (availableTrucks(typeOfTruck) == 0) {
            return ISSUE_FAIL_NO_TRUCKS_AVAILABLE;
        } else {
            for (Truck truck : trucks.values()) {
                if (truck.isAvailable() && truck.getType().equals(typeOfTruck)) {
                    truck.setAvailable(false);
                    RentalRecord rentalRecord = new RentalRecordImpl(person, truck, truck.getCapacity());
                    rentals.put(person, rentalRecord);
                    return ISSUE_SUCCESS;
                }
            }
        }
        return ISSUE_FAIL_UNKNOWN;
    }*/

   /* public int terminateRental(Person person) {
        RentalRecord rentalRecord = rentals.get(person);
        if (rentalRecord != null) {
            rentals.remove(person);
            Truck truck = rentalRecord.getTruck();
            truck.setAvailable(true);
            int fuelRequired = truck.getCapacity() - rentalRecord.getFuelLevel();
            return fuelRequired;
        } else {
            return -1;
        }
    }*/
}