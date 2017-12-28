package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

import java.awt.*;

public class SwitchScene extends Application {
    Stage window;
    Scene scene1, scene2, scene3;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("welcome to the first scene !");
        Button button1 = new Button("Go to scene 2 ");
        button1.setOnAction( e -> window.setScene(scene2));

        // layout 1 - children are laid out in vertical column
        StackPane layout1 = new StackPane();
        layout1.getChildren().add( button1);
        scene1 =  new Scene(layout1, 400, 300);

        //Button 2

        Button button2 = new Button("this scene susck, go to scene 3");
        button2.setOnAction(e -> window.setScene(scene3));

        //Button 3
        Button button3 = new Button("go to scene 1");
        button3.setOnAction(e -> window.setScene(scene1));
        //layout 3
        StackPane layout3 = new StackPane();
        layout3.getChildren().add(button3);
                scene3 = new Scene(layout3,500,400);

        //layout 2

        StackPane layout2 =  new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();


    }



}
