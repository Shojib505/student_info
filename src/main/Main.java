package main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }




    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent parent = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));

       Scene scene = new Scene(parent);
       primaryStage.setTitle("Main Screen");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

}
