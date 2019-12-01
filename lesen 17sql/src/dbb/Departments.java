package dbb;

public class Departments {
    private int deparid;
    private  String deparname;
    private int manegid;
    private int locotionid;

    public Departments(int deparid, String deparname, int manegid, int locotionid) {
        this.deparid = deparid;
        this.deparname = deparname;
        this.manegid = manegid;
        this.locotionid = locotionid;
    }

    public int getDeparid() {
        return deparid;
    }

    public void setDeparid(int deparid) {
        this.deparid = deparid;
    }

    public String getDeparname() {
        return deparname;
    }

    public void setDeparname(String deparname) {
        this.deparname = deparname;
    }

    public int getManegid() {
        return manegid;
    }

    public void setManegid(int manegid) {
        this.manegid = manegid;
    }

    public int getLocotionid() {
        return locotionid;
    }

    public void setLocotionid(int locotionid) {
        this.locotionid = locotionid;
    }
}
