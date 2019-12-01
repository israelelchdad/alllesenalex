package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField input;
    @FXML
     private Button HELO,by;
    @FXML
     private CheckBox chc;
    @FXML
     private Label l;
    public void print(ActionEvent actionEvent) {
         Thread T=new Thread(new Runnable() {
            @Override
            public void run() {
                Button B = (Button) actionEvent.getSource();
             System.out.println(B.getId()+" "+input.getText());
        try

        {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName());
            Platform.runLater(new Runnable() {
                @Override
                public void run() {

                    l.setText("i wuch up");
                    System.out.println(Thread.currentThread().getName());
                }
            });

        } catch(InterruptedException e)

            {
                e.printStackTrace();
            }
        }
        });
        T.start();

        }

    public void vis() {
        HELO.setDisable(false);
        by.setDisable(false);
    }

    public void delet(ActionEvent actionEvent) {
        if(chc.isSelected()){
            input.clear();
            input.setDisable(true);

        }else {
            input.setDisable(false);
        }

    }
}
