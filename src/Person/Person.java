package Person;

public class Person {
    private String name;
    private int age;
    private DrivingLicence drivingLicence;
    
    public Person(String name, int age, DrivingLicence drivingLicence) {
        this.name = name;
        this.age = age;
        this.drivingLicence = drivingLicence;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public DrivingLicence getDrivingLicence() {
        return drivingLicence;
    }
}