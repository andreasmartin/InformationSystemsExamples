package ch.fhnw.businessdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author andreas.martin
 */
public class Presenter implements Initializable {

    @FXML
    private TableView<Customer> customerTable;
    @FXML
    private TableColumn<Customer, String> firstNameColumn;
    @FXML
    private TableColumn<Customer, String> lastNameColumn;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;

    private final DatabaseManagerInMemory databaseManagerInMemory = DatabaseManagerInMemory.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        customerTable.setItems(databaseManagerInMemory.getCustomers());
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());

        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem = new MenuItem("delete");
        contextMenu.getItems().add(menuItem);
        menuItem.setOnAction((ActionEvent e) -> {
            int selectedIndex = customerTable.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                databaseManagerInMemory.deleteCustomer(customerTable.getItems().get(selectedIndex));
            }
        });

        customerTable.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent t) -> {
            if (t.getButton() == MouseButton.SECONDARY) {
                contextMenu.show(customerTable, t.getScreenX(), t.getScreenY());
            }
        });
    }

    @FXML
    private void handleCreateCustomer() {
        databaseManagerInMemory.createCustomer(firstName.getText(), lastName.getText());
    }
}
