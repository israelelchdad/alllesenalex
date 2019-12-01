package t2;

public class main {
    public static void main(String[] args) {

        printetred p1= new printetred();
       Thread c=new Thread("YY");//נותן שם לטרד
//        System.out.println(c.getName());
       threed t1=new threed("treed 1",p1);//נותן שם לטרד ע"י סופר בבנאי עם הסטרינג שנשלח כפרמטר
        threed t2=new threed("treed 2",p1);
//        t1.setName("treed 1");
//        t2.setName("treed 2");
        t1.start();
        t2.start();


    }
}
