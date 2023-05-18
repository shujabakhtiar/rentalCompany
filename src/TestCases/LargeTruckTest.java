package TestCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Truck.LargeTruck;
import Truck.StudentID;

public class LargeTruckTest {
	@Test
	public void addLargeTruck() {
		LargeTruck largeTruck = new LargeTruck("ABC123", 100);

        // Verify the registration number, fuel capacity, and initial fuel level
        Assert.assertEquals("ABC123", largeTruck.getRegistrationNumber());
        Assert.assertEquals(100, largeTruck.getFuelCapacity());
        Assert.assertEquals(100, largeTruck.getFuelLevel());

	}

}
