package ch.fhnw.businessdemo;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    
    private final View view = new View();
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(view.getView());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
