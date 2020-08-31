package com.company.springbootlogin.dao;

import com.company.springbootlogin.model.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> get();
    Customer get(int id);

    void save(Customer customer);


}
