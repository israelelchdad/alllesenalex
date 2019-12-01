package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
     private Button a1,a2,a3,a4,a5,a6, a7,a8 ,a9,c,min,plus,ch,sum;
    @FXML
    private TextField input;
    int nam1;
    int nam2;
    String z;



    public void rite(ActionEvent actionEvent) {
        Button b= (Button) actionEvent.getSource();
        if (input.getText().equals("+")||input.getText().equals("-")||input.getText().equals("*")||input.getText().equals("/")){
            input.setText(b.getText());
        }
        else {
        input.setText( input.getText()+b.getText());
        }
    }


    public void oper(ActionEvent actionEvent) throws InterruptedException {
        Button b1= (Button) actionEvent.getSource();
        this.nam1= Integer.parseInt(input.getText());
        this.z=b1.getText();
        input.setText(b1.getText());

    }

    public void opersum(ActionEvent actionEvent) {
         this.nam2= Integer.parseInt(input.getText());
         int total=0;
         switch (z){
             case "+":
                 total=this.nam1+this.nam2;
                 break;
             case "*" :
                 total=this.nam1*this.nam2;
                 break;
             case "-":
                 total=this.nam1-this.nam2;
                 break;
             case "/":
                 total=this.nam1/this.nam2;
                 }
                 input.setText(total+"");



    }

    public void reset(ActionEvent actionEvent) {
        input.setText("");


    }
}
