package targil1;

import java.time.Clock;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Masage w=new Masage("HELOW");
        Waiter w1=new Waiter(w);
        Waiter w2=new Waiter(w);
        Notify n1=new Notify(w);
        Thread T1=new Thread(w1,"1");
        Thread T2=new Thread(w2,"2");
        Thread T3=new Thread(n1,"3");
        T1.start();
        T2.start();
        T3.start();





    }
}
