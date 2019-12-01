package targilreantedlock;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static ReentrantLock r=new ReentrantLock(true);//כשמייצרים מנעול עם טרו המנעול נותן עדיפות לטרדים עם עדיפות(שורה 22)
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        a w=new a(s);
        b z=new b(s);

        Thread t1=new Thread(new a (s));
//        t1.setPriority(10);
//        t1.start();
//        Thread t2=new Thread(new b(s));
//        t2.start();
        ExecutorService poo= Executors.newFixedThreadPool(2);
        poo.execute(w);
        poo.execute(z);

        poo.shutdown();



    }
}

class a implements Runnable {
        ArrayList<Integer> t;


    public a(ArrayList<Integer> t) {
        this.t = t;

    }

    @Override
        public void run() {
        Main.r.lock();
        try {
            for (Integer I:t) {
                System.out.println(I);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }finally {
            Main.r.unlock();

        }
        }
    }
    class b implements Runnable {
        ArrayList<Integer> t;


        public b(ArrayList<Integer> t) {
            this.t = t;

        }

        @Override
        public void run() {
            Main.r.lock();
            try {
                for (int i = 0; i <t.size() ; i++) {
                    System.out.println(t.get(i));

                }
                t.remove(t.size()-1);

            }finally {
                Main.r.unlock();
                }



            }
    }

