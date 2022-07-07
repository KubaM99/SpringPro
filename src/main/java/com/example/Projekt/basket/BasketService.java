package com.example.Projekt.basket;

import com.example.Projekt.customer.Customer;
import com.example.Projekt.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketService {

    @Autowired
    private BasketRepo basketRepo;

    public void addCustomerId(Basket basket) {

        basketRepo.save(basket);
    }

    public List<Basket> getAll(){
        List<Basket> l = new ArrayList<>();
        basketRepo.findAll().forEach(l :: add);
        return l;
    }

}
