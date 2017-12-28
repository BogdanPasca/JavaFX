package sample;

        import com.sun.java.swing.plaf.windows.resources.windows;
        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.Alert;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;
        import javafx.scene.control.Button;


public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("titlu");
        Button buton1 = new Button("Clik me");

        // urmatoarea linie setez ce sa faca butonul din prima fereastra
      // buton1.setOnAction( e -> AlertBox.display(" Titul Fereastra", " Acesta este un mesaj "));

            //asta este pentru clasa confirm

        buton1.setOnAction(e ->{
          boolean result =  ConfirmBox.display("Title of window ", "Esti sigur ca vrei sa trimiti poze nud?" );
            System.out.println(result);
        });




        StackPane layout = new StackPane();
        layout.getChildren().add(buton1);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
