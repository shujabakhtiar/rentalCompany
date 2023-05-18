package Rental;
import java.time.LocalDate;
import Person.Person;
import Truck.Truck;

public class RentalRecord {

	    private Truck truck;
	    private Person person;
	    private LocalDate rentalStartDate;
	    
	    public RentalRecord(Truck truck, Person person, LocalDate rentalStartDate) {
	        this.truck = truck;
	        this.person = person;
	        this.rentalStartDate = rentalStartDate;
	    }
	    
	    public Truck getTruck() {
	        return truck;
	    }
	    
	    public Person getPerson() {
	    	return person;
	    	
	    }

}
