package threeds2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        tred t1=new tred();
        tred t2=new tred();
        t1.setthreed(t2);
//       t2.setthreed(t1); //ימתינו אחד לשני ויתקע לעולם ויתקעו אפשר להגדיר המתנה לזמן מסויים בג'וין
        t1.start();
        t2.start();





    }
}
