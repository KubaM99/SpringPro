package com.example.Projekt.basket;

import com.example.Projekt.customer.Customer;
import com.example.Projekt.item.Item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@NoArgsConstructor
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_basket;
    private Long ID_customer;
    private Long item1;
    private Long item2;
    private Long item3;

    public Basket(Long ID_customer, Long item1, Long item2, Long item3) {
        this.ID_customer = ID_customer;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public Long getID_customer() {
        return ID_customer;
    }

    public void setID_customer(Long ID_customer) {
        this.ID_customer = ID_customer;
    }

    public Long getItem1() {
        return item1;
    }

    public void setItem1(Long item1) {
        this.item1 = item1;
    }

    public Long getItem2() {
        return item2;
    }

    public void setItem2(Long item2) {
        this.item2 = item2;
    }

    public Long getItem3() {
        return item3;
    }

    public void setItem3(Long item3) {
        this.item3 = item3;
    }
}
