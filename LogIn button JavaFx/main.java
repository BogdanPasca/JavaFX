package sample;

import com.sun.java.swing.plaf.windows.resources.windows;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("titlu");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // name label
        Label nameLabel = new Label("Username: ");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        TextField nameInput = new TextField("Bruce Lee");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1 );

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        //login
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1,2);

       /* loginButton.setOnAction(e -> {
            setUserAgentStylesheet(STYLESHEET_CASPIAN);
        });                             asta e pentru style default */



        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);


        Scene scene = new Scene(grid, 300, 200);
        scene.getStylesheets().add("Viper.css");            // aici importa css-u creat de noi
        window.setScene(scene);
        window.show();


    }
}
