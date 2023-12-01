package com.kgisl.hibernate.dao;

import java.util.List;

import com.kgisl.hibernate.entity.Customer;

public interface CustomerDAO {
    List<Customer> getCustomers();

    void deleteCustomer(int id);

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void updateCustomer(Customer theCustomer);
}
