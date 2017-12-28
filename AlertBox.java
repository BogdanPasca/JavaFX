package sample;

import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String title, String message){
        final Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        window.setHeight(100);
        window.setWidth(300);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("close the window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().add(closeButton);
        layout.getChildren().add(label);
        layout.setAlignment(Pos.CENTER);

        Scene scene  = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        //closeButton.setOnAction( e -> window.close());



    }

}
