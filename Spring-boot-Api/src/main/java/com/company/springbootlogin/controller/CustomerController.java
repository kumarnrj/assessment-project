package com.company.springbootlogin.controller;

import com.company.springbootlogin.model.Customer;
import com.company.springbootlogin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customer")
    public List<Customer> get(){
        return  customerService.get();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/customer")
    public String save(@RequestBody Customer customer ){
        customerService.save(customer);
        return "Data added succesfully";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/customer/{id}")
    public Customer get(@PathVariable int id){
        Customer customerObject = customerService.get(id);
        if(customerObject==null){
            throw new RuntimeException(("Employee with th id"+id+"Doest not existst"));
        }
        else{
            return  customerObject;
        }
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/customer")
    public String update(@RequestBody Customer customer){
        customerService.save(customer);
        return "data is added succussfuly";
    }



}
