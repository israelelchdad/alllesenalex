package t3;


import java.util.Random;

public class tred implements Runnable {
    private Massage m;


    public tred(Massage m) {
        this.m = m;
    }

    @Override
    public void run() {
        String[] arr={"avi","1999","maried","30"};
        Random random=new Random();
        for (int i = 0; i <arr.length ; i++) {
            m.write(arr[i]);

            try {
                 Thread.sleep(random.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        m.write("finish");

    }
}
