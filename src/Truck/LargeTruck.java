package Truck;

import java.util.HashSet;
import java.util.Set;


public class LargeTruck extends Truck {
    private static final int INITIAL_FUEL_CONSUMPTION_RATE = 10;
    private static final int FINAL_FUEL_CONSUMPTION_RATE = 15;
    private static final int DISTANCE_THRESHOLD = 50;
    
	
    public LargeTruck(String registrationNumber, int fuelCapacity) {
        super(registrationNumber, fuelCapacity);
    }
    private static final int MAX_SIZE = 10;
    private static final Set<LargeTruck> largeTrucks = new HashSet<>();

    public static boolean addLargeTruck(LargeTruck truck) {
        if (largeTrucks.size() < MAX_SIZE) {
            return largeTrucks.add(truck);
        }
        return false; // Reached the maximum size, cannot add more trucks
    }
    @Override
    public int drive(int distance) {
        int fuelConsumed = 0;
        int remainingDistance = distance;

        while (remainingDistance > 0 && fuelLevel > 0) {
            if (remainingDistance > DISTANCE_THRESHOLD) {
                fuelConsumed += DISTANCE_THRESHOLD / INITIAL_FUEL_CONSUMPTION_RATE;
                remainingDistance -= DISTANCE_THRESHOLD;
            } else {
                fuelConsumed += remainingDistance / FINAL_FUEL_CONSUMPTION_RATE;
                remainingDistance = 0;
            }
            fuelLevel--;
        }

        return fuelConsumed;
    }
}