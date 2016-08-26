package ch.fhnw.businessdemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatabaseManagerInMemory {

    private static final ObservableList<Customer> customerData = FXCollections.observableArrayList();

    private static DatabaseManagerInMemory instance = null;

    private DatabaseManagerInMemory() {
    }

    public static DatabaseManagerInMemory getInstance() {
        if (instance == null) {
            instance = new DatabaseManagerInMemory();
        }
        return instance;
    }

    public ObservableList<Customer> getCustomers() {
        return customerData;
    }

    public Customer createCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customerData.add(customer);
        return customer;
    }

    public void deleteCustomer(Customer customer) {
        customerData.remove(customer);
    }

}
