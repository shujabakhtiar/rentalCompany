package Person;

import java.time.LocalDate;

public class DrivingLicence {
    private String licenceNumber;
    private LocalDate expiryDate;
    private String typeOfLicense;
    
    public DrivingLicence(String licenceNumber, LocalDate expiryDate, String typeOfLicense) {
        this.licenceNumber = licenceNumber;
        this.expiryDate = expiryDate;
        this.typeOfLicense = typeOfLicense;
    }
    
    public String getLicenceNumber() {
        return licenceNumber;
    }
    
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    
    public String getTypeOfLicense() {
        return typeOfLicense;
    }
}