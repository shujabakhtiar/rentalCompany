package TestCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Truck.SmallTruck;

public class SmallTruckTest {

	@Test
	public void addSmallTruck() {
		SmallTruck SmallTruck = new SmallTruck("ABC123", 100);
		System.out.println("hey"+SmallTruck.getNumberOfSmallTrucks());

        // Verify the registration number, fuel capacity, and initial fuel level
        Assert.assertEquals("ABC123", SmallTruck.getRegistrationNumber());
        Assert.assertEquals(100, SmallTruck.getFuelCapacity());
        Assert.assertEquals(100, SmallTruck.getFuelLevel());

	}

}
