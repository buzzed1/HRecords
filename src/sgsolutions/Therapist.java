package sgsolutions;

import java.util.Map;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Therapist {
   private static int ID = 0;
    private int NPI;
    private int licsNim;
    private int insurNum;
   private String firstName;
    private String lastName;
    private String email;
   private String modality;
    private String SSN;
    private String DOB;
    private String regExp;
    private String ppdExp;
   private String liabInsExp;
    private String phoneNum;
    private String address;
    private Consumer consumer;
    private int sessions;
    private String supervisor;

   private Map<String, ArrayList<Consumer>> site;
   private Map<String, ArrayList<Integer>> ratePerSite;


    public Therapist(String firstName, String lastName, String modality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.modality = modality;
        ID = ID++;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNPI() {
        return NPI;
    }

    public void setNPI(int NPI) {
        this.NPI = NPI;
    }

    public int getLicsNim() {
        return licsNim;
    }

    public void setLicsNim(int licsNim) {
        this.licsNim = licsNim;
    }

    public int getInsurNum() {
        return insurNum;
    }

    public void setInsurNum(int insurNum) {
        this.insurNum = insurNum;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getRegExp() {
        return regExp;
    }

    public void setRegExp(String regExp) {
        this.regExp = regExp;
    }

    public String getPpdExp() {
        return ppdExp;
    }

    public void setPpdExp(String ppdExp) {
        this.ppdExp = ppdExp;
    }

    public String getLiabInsExp() {
        return liabInsExp;
    }

    public void setLiabInsExp(String liabInsExp) {
        this.liabInsExp = liabInsExp;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, ArrayList<Consumer>> getSite() {  // Should this be public?
        return site;
    }

    public void setSite(Map<String, ArrayList<Consumer>> site) { // Should this be public?
        this.site = site;
    }

    public Map<String, ArrayList<Integer>> getRatePerSite() { //should this be public?
        return ratePerSite;
    }

    public void setRatePerSite(Map<String, ArrayList<Integer>> ratePerSite) {
        this.ratePerSite = ratePerSite;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public String toString() {
        return "sgsolutions.Therapist{" +
                "ID=" + ID +
                ", NPI=" + NPI +
                ", licsNim=" + licsNim +
                ", insurNum=" + insurNum +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", modality='" + modality + '\'' +
                ", SSN='" + SSN + '\'' +
                ", DOB='" + DOB + '\'' +
                ", regExp='" + regExp + '\'' +
                ", ppdExp='" + ppdExp + '\'' +
                ", liabInsExp='" + liabInsExp + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", site=" + site +
                ", ratePerSite=" + ratePerSite +
                '}';
    }


    public int getSessions() {
        return sessions;
    }

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
