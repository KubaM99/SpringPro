package com.example.Projekt.customer;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/c")
    public void add(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }
    @GetMapping("/c")
    public List<Customer> findAll(){
        return customerService.getAll();
    }

    @GetMapping("/cf/{id}")
    public Optional<Customer> findById(@PathVariable Long id){
        return customerService.findById(id);
    }
}
