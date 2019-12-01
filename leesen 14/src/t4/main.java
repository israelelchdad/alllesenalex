package t4;

public class main {
    public static void main(String[] args) {
        taibal o= new taibal();

        mythred1 t1=new mythred1(o);
        mytred2 t2=new mytred2(o);

        t1.start();
        t2.start();

    }

}
