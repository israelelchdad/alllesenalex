package targil1;

public class Notify implements Runnable {
    Masage m;

    public Notify(Masage m) {
        this.m = m;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " started" );

            try {
                Thread.sleep(2001);
            } catch (Exception e) {

            }
            synchronized (this.m) {
                m.setS("notify notified");
                System.out.println(m.getS());
//                m.notify();
                this.m.notifyAll();

          }


    }
}
