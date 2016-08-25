package ch.fhnw.businessdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author andreas.martin
 */
public class Presenter implements Initializable {

    @FXML
    private TableView<Customer> CustomerTable;
    @FXML
    private TableColumn<Customer, String> firstNameColumn;
    @FXML
    private TableColumn<Customer, String> lastNameColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CustomerTable.setItems(DatabaseManagerInMemory.getData());
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }
}
