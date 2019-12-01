package t4;

public class mytred2 extends Thread{
    taibal t;

    public mytred2(taibal t) {
        this.t = t;
    }

    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("thred 2 isrunnig");

        }

        t.printableminus(100);

    }
}
