package sgsolutions;

public class Site {
    private int siteID;
    private String company;
    private String siteName;
    private String address;
    private String phoneNum;
    private String resMan;
    private String msc;
    private String fax;

    public int getSiteID() {
        return siteID;
    }

    public void setSiteID(int siteID) {
        this.siteID = siteID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getResMan() {
        return resMan;
    }

    public void setResMan(String resMan) {
        this.resMan = resMan;
    }

    public String getMsc() {
        return msc;
    }

    public void setMsc(String msc) {
        this.msc = msc;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "sgsolutions.Site{" +
                "siteID=" + siteID +
                ", company='" + company + '\'' +
                ", siteName='" + siteName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", resMan='" + resMan + '\'' +
                ", msc='" + msc + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }


}
