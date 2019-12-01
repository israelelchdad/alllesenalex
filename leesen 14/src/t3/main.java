package t3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        Massage a=new Massage();
        //tred t=new tred(a);
        Thread tt=new Thread(new tred(a));// ביצוע של הכנסת הרנאבול בשורה אחת
         //Thred2 s=new Thred2(a);
        Thread l=new Thread(new Thred2(a));//ביצוע של הכנסת הרנאבול בשורה אחת
        tt.start();
        l.start();


    }
}
