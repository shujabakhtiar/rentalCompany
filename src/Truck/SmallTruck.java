package Truck;

import java.util.HashSet;
import java.util.Set;

public class SmallTruck extends Truck {
    private static final int FUEL_CONSUMPTION_RATE = 20;
    private static final int MAX_SIZE = 20;
    private static final Set<SmallTruck> SmallTrucks = new HashSet<>();

    public SmallTruck(String registrationNumber, int fuelCapacity) {
        super(registrationNumber, fuelCapacity);
    }
    
    public static boolean addSmallTruck(SmallTruck truck) {
        if (SmallTrucks.size() < MAX_SIZE) {
            return SmallTrucks.add(truck);
        }
        return false; // Reached the maximum size, cannot add more trucks
    }
    
    

    @Override
    public int drive(int distance) {
        int fuelConsumed = distance / FUEL_CONSUMPTION_RATE;
        fuelLevel -= fuelConsumed;
        return fuelConsumed;
    }

    public static int getNumberOfSmallTrucks() {
		return SmallTrucks.size();
	}

}
