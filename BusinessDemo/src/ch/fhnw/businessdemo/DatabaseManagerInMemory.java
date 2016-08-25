package ch.fhnw.businessdemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatabaseManagerInMemory{
    
    private static final ObservableList<Customer> customerData = FXCollections.observableArrayList();

    public static ObservableList getData()
    {
        initIfEmpty();
        return customerData;
    }
    
    private static void initIfEmpty()
    {
        customerData.add(new Customer("Hans", "Muster"));
        customerData.add(new Customer("Ruth", "Mueller"));
        customerData.add(new Customer("Heinz", "Kurz"));
        customerData.add(new Customer("Cornelia", "Meier"));
        customerData.add(new Customer("Werner", "Meyer"));
        customerData.add(new Customer("Lydia", "Kunz"));
        customerData.add(new Customer("Anna", "Best"));
        customerData.add(new Customer("Stefan", "Meier"));
        customerData.add(new Customer("Martin", "Mueller"));
    }
    
    public Customer createCustomer(String firstName, String lastName)
    {
        Customer customer = new Customer(firstName, lastName);
        customerData.add(customer);
        return customer;
    }
    
    public static void deleteInitData()
    {
        customerData.remove(0, 9);
    }
    
}
