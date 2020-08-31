package com.company.springbootlogin.dao;

import com.company.springbootlogin.model.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import java.util.List;

@Repository
public class CustomerDAOImplementation implements CustomerDAO {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Customer> get() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
        List<Customer> list = query.getResultList();
        return  list;
    }

    @Override
    public Customer get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Customer customer = currentSession.get(Customer.class,id);
        return  customer;
    }

    @Override
    public void save(Customer customer) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.save(customer);

    }


}


