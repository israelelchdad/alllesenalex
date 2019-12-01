package dbb;

import java.sql.*;
import java.util.ArrayList;

public class sqlit {
    public static  final  String  DBFILE= "DB2.db";
    public static  final  String PATHNAME="jdbc:sqlite:\\C:\\Users\\stu.RAVTECH\\Desktop\\"+DBFILE;
    public static final String deparid = "DEPARTMENT_ID";
    public static final String deparname= "DEPARTMENT_NAME";
    public static final String manegid="MANAGER_ID";
    public static final String locotionid="LOCATION_ID";
    public static final String INSERTNEWDEP="INSERT INTO departments"+'('+deparid+ ','+deparname+ ','+ manegid+','+locotionid+ ") VALUES(?,?,?,?)";

    private Connection c;
    private Statement s;
    private PreparedStatement insertnewDEP;



    public boolean aa (){
        try {
            this.c= DriverManager.getConnection(PATHNAME);
            insertnewDEP=c.prepareStatement(INSERTNEWDEP);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }public void closes(){
        if (this.c!=null){
        try {
            this.c.close();
            System.out.println("close connection");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
    public  ArrayList  depar(){
        ArrayList<Departments> departments=new ArrayList <>();
        try {
            this.s=c.createStatement();

            ResultSet rr=s.executeQuery("SELECT*FROM departments");

            while (rr.next()){
                int deparidd=rr.getInt(deparid);
                String deparnamm=rr.getString( deparname);
                int manegidd=rr.getInt(manegid);
                int locotionidd=rr.getInt(locotionid);
                Departments d=new Departments(deparidd,deparnamm,manegidd,locotionidd);
//              d.setDeparid(rr.getInt(deparid));    //  יצור אוביקט באמצעות סט ונתינת ערכים ישירות באמצעות המצביע רר,   וכמובן שאפשר  באמצעות המשתנים לעיל
//               d.setDeparname(rr.getString(deparname ));
//               d.setManegid(rr.getInt(manegid));
//                d.setLocotionid(rr.getInt(locotionid));
                departments.add(d);
            }
            this.s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;

    }public void puttotaible(int deparidd, String deparnamm,  int manegidd, int locotionidd) throws SQLException{
        this.insertnewDEP.setInt(1,deparidd);
        this.insertnewDEP.setString(2,deparnamm);
        this.insertnewDEP.setInt(3,manegidd);
        this.insertnewDEP.setInt(4,locotionidd);
        this.insertnewDEP.executeUpdate();


    }

}
