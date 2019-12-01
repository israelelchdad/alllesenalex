package t2;

public class threed extends Thread {
    printetred p;

    public threed( String A,printetred p) {
        super(A);
        this.p = p;
    }

    @Override
    public void run() {
        p.print();

    }
}
