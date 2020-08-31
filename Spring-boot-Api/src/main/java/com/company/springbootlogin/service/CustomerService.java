package com.company.springbootlogin.service;

import com.company.springbootlogin.model.Customer;

import java.util.EmptyStackException;
import java.util.List;

public interface CustomerService {
    List<Customer> get();
    Customer get(int id);
    void save(Customer customer);

}
