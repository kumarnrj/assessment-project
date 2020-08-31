package com.company.springbootlogin.service;

import com.company.springbootlogin.dao.CustomerDAO;
import com.company.springbootlogin.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.Callable;

@Service
@Transactional
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> get() {
        return customerDAO.get();
    }

    @Override
    @Transactional
    public Customer get(int id) {

       return customerDAO.get(id);
    }

    @Override
    @Transactional
    public void save(Customer customer) {
         customerDAO.save(customer);

    }


}
