package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Stage s=new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("conc.fxml"));
        s.setTitle("Hello World");
        s.setScene(new Scene(root2, 1000, 275));
        s.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
