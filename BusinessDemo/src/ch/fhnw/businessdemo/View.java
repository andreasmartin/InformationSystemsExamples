package ch.fhnw.businessdemo;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andreas.martin
 */
public class View {
    
    private final Presenter controller = new Presenter();

    public Scene getView() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserInterface.fxml"));
        loader.setController(controller);
        loader.setClassLoader(getClass().getClassLoader());
        return new Scene(loader.load());
    }

}
