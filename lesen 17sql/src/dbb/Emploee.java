package dbb;

public class Emploee {
    private int empleid;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenamber;
    private String hiredate;
    private String jobid;

    public int getEmpleid() {
        return empleid;
    }

    public void setEmpleid(int empleid) {
        this.empleid = empleid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenamber() {
        return phonenamber;
    }

    public void setPhonenamber(String phonenamber) {
        this.phonenamber = phonenamber;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    public int getManegerid() {
        return manegerid;
    }

    public void setManegerid(int manegerid) {
        this.manegerid = manegerid;
    }

    public int getDepartid() {
        return departid;
    }

    public void setDepartid(int departid) {
        this.departid = departid;
    }

    private int salery;
    private int commision;
    private int manegerid;
    private int departid;


}
