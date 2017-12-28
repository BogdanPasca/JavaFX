package sample;

import com.sun.java.swing.plaf.windows.resources.windows;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class ValInput extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("titlu");

        //Form

        final TextField nameInput = new TextField();
        Button button = new Button("click me");

        button.setOnAction(e -> isInt(nameInput, nameInput.getText()));


        //Layout

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

        private boolean isInt(TextField input, String message){
        try {
                int age  = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
                return true;
        } catch (NumberFormatException e){
            System.out.println("Error " + message + " is not a number");
            return  false;
        }

        }





    }













