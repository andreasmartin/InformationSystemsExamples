package ch.fhnw.businessdemo;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class View {
    
    private final Presenter controller = new Presenter();

    public Scene getView() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserInterface.fxml"));
        loader.setController(controller);
        loader.setClassLoader(getClass().getClassLoader());
        return new Scene(loader.load());
    }

}
