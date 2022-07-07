package com.example.Projekt.customer;


import com.example.Projekt.basket.Basket;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_customer;
    private String name;

    public Customer() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    //private Basket basket;
    private String lastName;
    private String emailId;



    public Customer(String name, String lastName,String emailId) {
        this.name = name;
        this.lastName = lastName;
        this.emailId = emailId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
