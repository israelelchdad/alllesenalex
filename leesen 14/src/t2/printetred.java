package t2;

public class printetred {
    private int i=0;

    public  void print(){
        String col;
        switch (Thread.currentThread().getName()) {
            case "treed 1":
                col = color.ANSI_BLUE;
                break;
            case "treed 2":
                col = color.ANSI_GREEN;
                break;
            default:
                col = color.ANSI_PURPLE;
        }

               synchronized (this){     //סינכרון של חלק מקטע קוד מקבל כפרמטר את האובייקט ,ןבתוך הפונקציה {} נכנס קטע הקוד אותו נרצה לסנכרן
                for ( i = 0; i <10 ; i++) {
                    System.out.println(col + Thread.currentThread().getName() + " i " + i);
               }
                }
        }



    }

