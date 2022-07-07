package com.example.Projekt.customer;

import com.example.Projekt.item.Item;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService implements CustoemerInterface  {

    private CustomerRepo customerRepo;

    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        customerRepo.findAll().forEach(customers :: add);
        return customers;
    }

    public void addCustomer(Customer customer){
        customerRepo.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepo.findById(id);
    }
}
