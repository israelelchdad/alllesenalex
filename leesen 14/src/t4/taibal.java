package t4;

public class taibal {
    public synchronized void printabale(int n){
        for (int i = 1; i <=5 ; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }public synchronized void  printableminus(int n){
        for (int i = 5; i >1 ; i--) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
