package traedss;

public class Runcolorable extends color implements Runnable {
    @Override
    public void run() {
        System.out.println(this.ANSI_RED+"i am implements run able"+" "+Thread.currentThread().getName());

    }
}
