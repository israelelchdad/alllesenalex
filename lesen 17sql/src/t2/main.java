package t2;

import dbb.Departments;
import dbb.sqlit;

import java.sql.SQLException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        sqlit f = new sqlit();
        f.aa();
        try {
            f.puttotaible(5,"ddd",6,7);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (f.aa()==false){
            System.out.println("not FILE");
        }else {
            System.out.println("file nicnas");
        }
        ArrayList<Departments>aa= f.depar();
        for (int i = 0; i <aa.size() ; i++) {
            System.out.println(aa.get(i).getDeparid()+" "+aa.get(i).getDeparname()+" "+ aa.get(i).getManegid()+" "+aa.get(i).getLocotionid());

        }
        f.closes();

    }
}
