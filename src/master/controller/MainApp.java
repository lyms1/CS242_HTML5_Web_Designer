package master.controller;

/**
 * Created by Thanh-Phong on 11/14/2015.
 */

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import master.model.ApplicationManager;


import java.io.IOException;

public class MainApp extends Application {

    String windowTitle = "HTML5 Website Designer";

    public static void main(String[] args) {
        launch(args);
        /*
            Not needed for this application.
         */
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
        Scene scene = new Scene(new StackPane());

        ApplicationManager applicationManager = new ApplicationManager();

        try{
            FXMLLoader editorLoader = new FXMLLoader();
            editorLoader.setLocation(MainApp.class.getResource("../view/MainEditorOverView.fxml"));
            Pane editorLayout = editorLoader.load();

            scene = new Scene(editorLayout);

        }catch(IOException e) {
            e.printStackTrace();
        }

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
