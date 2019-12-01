package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class savetofile {
    private static savetofile single=new savetofile();
    private static String pat="savefile.txt";
    private List<task> lists;

    private savetofile() {

    }
    public static savetofile getSingle(){
        return single;
    }
    public List<task> getLists(){
        return lists;
    }
    public void setLists(List<task> lis){
        this.lists=lis;
    }
    public void savedata()throws IOException{
        Path path= Paths.get(pat);
        BufferedWriter bufferedWriter= Files.newBufferedWriter(path);
        for (int i = 0; i <lists.size() ; i++) {
            bufferedWriter.write(lists.get(i).getSmall());
            bufferedWriter.newLine();

        }
        bufferedWriter.close();

    }

}
