package com.example.Projekt.customer;

import java.util.Optional;

public interface CustoemerInterface {

    Optional<Customer> findById(Long id);
}
