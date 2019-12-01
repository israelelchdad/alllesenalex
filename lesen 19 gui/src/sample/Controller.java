package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


import java.awt.*;

public class Controller {
    @FXML
    private TextField userInput;
    public void doit2(ActionEvent actionEvent) {
        System.out.println(userInput.getText());
    }
    public void doit(ActionEvent actionEvent) {
        System.out.println("print me");
    }


}
