package targil1;

import java.time.Clock;

public class Waiter implements Runnable {
    Masage m;


    public Waiter(Masage m) {
        this.m = m;
    }

    @Override
    public void run() {

            synchronized (this.m) {
                Clock a = Clock.systemUTC();

                System.out.println(Thread.currentThread().getName() + " " + a.millis());
                try {
                    this.m.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(m.getS() + " " + Thread.currentThread().getName() + " " + a.millis());


            }


    }
}
