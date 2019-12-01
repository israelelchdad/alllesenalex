package sample;

import java.time.LocalDate;

public class task {
    private String small;
    private String big;
    private LocalDate local;

    public task(String small, String big, LocalDate local) {
        this.small = small;
        this.big = big;
        this.local = local;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public LocalDate getLocal() {
        return local;
    }

    public void setLocal(LocalDate local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return  small
                ;
    }
}
