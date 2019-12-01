package t3;

import java.util.Random;

public class Thred2 implements Runnable{
    Massage m;


    public Thred2(Massage m) {
        this.m = m;
    }

    @Override
    public void run() {
        Random random=new Random();
        for (String s=m.read();!s.equals("finish");s=m.read()){
            System.out.println(s);
            try {
                Thread.sleep(random.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
