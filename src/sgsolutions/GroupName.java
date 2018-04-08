package sgsolutions;

public class GroupName {
    private String name;
    private String modality;
    private String ssnNum;
    private String licenceNum;
    private String startDate;
    private String mcaidProvNum;
    private String liabInsurExpiryDate; // expires annually
    private String etinExpiry; //expires annually
    private String registrationExpiry; //expires every three years

    public GroupName (){

    }
    public GroupName(String name) {
        this.name = name;
    }

    public GroupName(String name, String modality) {
        this.name = name;
        this.modality = modality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getSsnNum() {
        return ssnNum;
    }

    public void setSsnNum(String ssnNum) {
        this.ssnNum = ssnNum;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public void setLicenceNum(String licenceNum) {
        this.licenceNum = licenceNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getMcaidProvNum() {
        return mcaidProvNum;
    }

    public void setMcaidProvNum(String mcaidProvNum) {
        this.mcaidProvNum = mcaidProvNum;
    }

    public String getLiabInsurExpiryDate() {
        return liabInsurExpiryDate;
    }

    public void setLiabInsurExpiryDate(String liabInsurExpiryDate) {
        this.liabInsurExpiryDate = liabInsurExpiryDate;
    }

    public String getEtinExpiry() {
        return etinExpiry;
    }

    public void setEtinExpiry(String etinExpiry) {
        this.etinExpiry = etinExpiry;
    }

    public String getRegistrationExpiry() {
        return registrationExpiry;
    }

    public void setRegistrationExpiry(String registrationExpiry) {
        this.registrationExpiry = registrationExpiry;
    }

    @Override
    public String toString() {
        return "sgsolutions.GroupName{" +
                "name='" + name + '\'' +
                ", modality='" + modality + '\'' +
                ", ssnNum='" + ssnNum + '\'' +
                ", licenceNum='" + licenceNum + '\'' +
                ", startDate='" + startDate + '\'' +
                ", mcaidProvNum='" + mcaidProvNum + '\'' +
                ", liabInsurExpiryDate='" + liabInsurExpiryDate + '\'' +
                ", etinExpiry='" + etinExpiry + '\'' +
                ", registrationExpiry='" + registrationExpiry + '\'' +
                '}';
    }
}
