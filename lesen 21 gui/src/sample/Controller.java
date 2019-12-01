package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;


public class Controller {

    ArrayList<task> tasks=new ArrayList<>() ;
    @FXML
     ListView ll;
    @FXML
     private Label lab,date;
    public void initialize(){

        task t1=new task("gave doar","3 box now",LocalDate.of(1999,10,15));
        task t2=new task("BAY COOS","5 CHOS OF ZARA",LocalDate.of(2000,7,19));
        task t3=new task("CLER JACET","I NEED TO GO TO CHOP ",LocalDate.of(1899,2,14));
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);

       ll.getItems().addAll(tasks);
        savetofile.getSingle().setLists(tasks);

    }

    public void print() {
        int a=ll.getSelectionModel().getSelectedIndex();
        lab.setText(tasks.get(a).getBig());
        date.setText(tasks.get(a).getLocal().toString());
    }

    public void save(ActionEvent actionEvent) {
        try {
            savetofile.getSingle().savedata();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
