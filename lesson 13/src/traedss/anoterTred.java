package traedss;

public class anoterTred extends Thread {
    color s=new color();
    public void run(){
        System.out.println(s.ANSI_PURPLE+"helo from another tred"+" "+Thread.currentThread().getName());
        try {
            sleep(500);
        } catch (InterruptedException e) {
//           e.printStackTrace();//print the type expshns
            System.out.println("hofrhh");
//            return;
        }


        System.out.println("whit sleep 500 mille");
    }
}
