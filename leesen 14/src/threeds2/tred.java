package threeds2;

public class tred extends Thread {
    Thread t;
    @Override
    public void run() {
//        if (t==null){
//            try {
//                sleep(999);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println(Thread.currentThread().getName()+"  start");
        if (t!=null){
        try {
             t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        System.out.println(Thread.currentThread().getName()+"  finish");
    }
    public void setthreed(Thread t){
         this.t=t;

    }
}
