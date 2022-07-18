package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SplashScreenController {


    public Label lblLoad;

    public void initialize(){
        Timeline timeline =new Timeline();
        KeyFrame keyFrame1 = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                lblLoad.setText("Loading Plugins ....");
            }
        });
        KeyFrame keyFrame2 = new KeyFrame(Duration.millis(1500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblLoad.setText("Loading UI ....");
            }
        });KeyFrame keyFrame3 = new KeyFrame(Duration.millis(2500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblLoad.setText("Loading Resource ....");
            }
        });
        KeyFrame keyFrame4 = new KeyFrame(Duration.millis(3500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/TextEditor.fxml");
                try {
                    Parent container = FXMLLoader.load(resource);
                    Scene editorScene = new Scene(container);
                    Stage primaryStage = new Stage();
                    primaryStage.setScene(editorScene);
                    primaryStage.setTitle("Dep-9-  Text Editor");
                    primaryStage.show();
                    primaryStage.centerOnScreen();
                    lblLoad.getScene().getWindow().hide();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        timeline.getKeyFrames().addAll(keyFrame1,keyFrame2,keyFrame3,keyFrame4);
        timeline.playFromStart();






    }
}
