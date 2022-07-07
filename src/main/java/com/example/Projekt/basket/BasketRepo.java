package com.example.Projekt.basket;

import com.example.Projekt.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface BasketRepo extends JpaRepository<Basket,Long> {




}


