package com.kgisl.hibernate.service;
import java.util.List;

import com.kgisl.hibernate.entity.Customer;


public interface CustomerService {
    List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    void updateCustomer(Customer theCustomer);
}

