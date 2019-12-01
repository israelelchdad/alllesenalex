package t3;

public class Massage {
    private String massage;
    private boolean empty=true;

    public synchronized  String read(){
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            System.out.println("read");

        }
        empty=true;
        notify();
        return massage;
    }
    public synchronized  void write(String massage){
        while (!empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
//        System.out.println("write");
        empty=false;
        this.massage=massage;
        notify();
}

    public String getMassage() {
        return massage;
    }
}
