package ch.fhnw.businessdemo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class Application extends JFrame {

    private JFXPanel panel;
    private final View view = new View();

    public Application() {
        this.createGUI();
    }

    private void createGUI() {
        this.setTitle("BusinessDemo");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(320, 200);
        panel = new JFXPanel();

        Platform.runLater(() -> {
            try {
                panel.setScene(view.getView());
                this.getContentPane().add(panel);
                this.add(panel);
                this.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
