package t4;

public class mythred1 extends Thread {
    taibal t;

    public mythred1(taibal t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printabale(5);
    }
}
