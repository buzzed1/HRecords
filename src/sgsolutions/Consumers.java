package sgsolutions;

public class Consumers {
    private String firstName;
    private String lastName;
    private String DOB;
    private String medicaidID;
    private String insuranceID;
    private String medicare;
    private String otherIns;
    private String city;
    private String state;
    private String zip;
    private String dateAdded;
    private boolean seen;
    private String dateSeen;


    public Consumers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Consumers(String firstName, String lastName, String medicaidID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.medicaidID = medicaidID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getMedicaidID() {
        return medicaidID;
    }

    public void setMedicaidID(String medicaidID) {
        this.medicaidID = medicaidID;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getMedicare() {
        return medicare;
    }

    public void setMedicare(String medicare) {
        this.medicare = medicare;
    }

    public String getOtherIns() {
        return otherIns;
    }

    public void setOtherIns(String otherIns) {
        this.otherIns = otherIns;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "sgsolutions.Consumers{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", medicaidID='" + medicaidID + '\'' +
                ", insuranceID='" + insuranceID + '\'' +
                ", medicare='" + medicare + '\'' +
                ", otherIns='" + otherIns + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                '}';
    }
}
