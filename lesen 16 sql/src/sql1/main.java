package sql1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<User> users=new ArrayList<>();
        while (true) {
            String s = getmassage("chouse a for ryshom or b  lethaber ");
            if (s.equals("a")){
                rysom(users);
                }
            else if (s.equals("b")){
                login(users);


            }  else {
                System.out.println("no chose good ples try again ");

            }
        }




    }
        public  static String getmassage (String masage){
        Scanner scanner=new Scanner(System.in);
        System.out.println(masage);
        return scanner.nextLine();
        }
        public static void rysom(ArrayList<User> A){
            String  a=getmassage("plese enter name");
            int p=Integer.parseInt(getmassage("plese ebter pasword"));
            User u=new User(a,p);
            A.add(u);


        }
        public static void login(ArrayList<User> A){
        String  b=getmassage("plese enter user  name");
        int pp=Integer.parseInt(getmassage("plese ebter pasword"));

        for (int i = 0; i <A.size() ; i++) {
            if (b.equals(A.get(i).getUsername())&&pp==A.get(i).getPasword()){
                System.out.println("hethabart saccasead");
                return;
            }

        }
        System.out.println("hitchbrote nicshela");
        }



    }

