package traedss;

public class Main {
    public static void main(String[] args) {
        color a=new color();

        System.out.println(a.ANSI_BLUE+"the main thraid"+" "+Thread.currentThread().getName());
        Thread another=new anoterTred();
      another.start();
      another.interrupt();
//      another.run();
       new Thread(){
            @Override
            public void run() {
                System.out.println(a.ANSI_GREEN+"i am anonimos class"+" "+Thread.currentThread().getName());
            }
        }.start();
       System.out.println(a.ANSI_BLUE+"the main thraid"+" "+Thread.currentThread().getName());
       Runcolorable x=new Runcolorable();
       Thread z=new Thread(x);
       z.start();
       z.run();
       x.run();


    }
}
