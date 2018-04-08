package sgsolutions;

public class AttendanceSheet {
    private Therapist therapist;
    private String month;
    private String date;
    private Site site;
    private Consumers consumer;
    private String cpt1;
    private String cpt2;
    private String icd10;
    private GroupName groupName;
    private String startTime;
    private String endTime;
    private int totalSeen;
    private int totalAbsent;
    private int totalCancelled;



    public AttendanceSheet(String month, String date, Site site) {
        this.month = month;
        this.date = date;
        this.site = site;
    }



    public Therapist getTherapist() {
        return therapist;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Consumers getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumers consumer) {
        this.consumer = consumer;
    }

    public String getCpt1() {
        return cpt1;
    }

    public void setCpt1(String cpt1) {
        this.cpt1 = cpt1;
    }

    public String getCpt2() {
        return cpt2;
    }

    public void setCpt2(String cpt2) {
        this.cpt2 = cpt2;
    }

    public String getIcd10() {
        return icd10;
    }

    public void setIcd10(String icd10) {
        this.icd10 = icd10;
    }

    public GroupName getGroupName() {
        return groupName;
    }

    public void setGroupName(GroupName groupName) {
        this.groupName = groupName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getTotalSeen() {
        return totalSeen;
    }

    public void setTotalSeen(int totalSeen) {
        this.totalSeen = totalSeen;
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }

    public void setTotalAbsent(int totalAbsent) {
        this.totalAbsent = totalAbsent;
    }

    public int getTotalCancelled() {
        return totalCancelled;
    }

    public void setTotalCancelled(int totalCancelled) {
        this.totalCancelled = totalCancelled;
    }

    @Override
    public String toString() {
        return "sgsolutions.AttendanceSheet{" +
                "therapist=" + therapist +
                ", month='" + month + '\'' +
                ", date='" + date + '\'' +
                ", site=" + site +
                ", consumer=" + consumer +
                ", cpt1='" + cpt1 + '\'' +
                ", cpt2='" + cpt2 + '\'' +
                ", icd10='" + icd10 + '\'' +
                ", groupName=" + groupName +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", totalSeen=" + totalSeen +
                ", totalAbsent=" + totalAbsent +
                ", totalCancelled=" + totalCancelled +
                '}';
    }
}
