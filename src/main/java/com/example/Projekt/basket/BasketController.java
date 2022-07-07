package com.example.Projekt.basket;

import com.example.Projekt.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketController {
    @Autowired
    private BasketService basketService;

    @PostMapping("/b")
    public void  addCustomerId(@RequestBody Basket i){
        basketService.addCustomerId(i);
    }

    @RequestMapping("/b")
    public List<Basket> getAll(){
        return basketService.getAll();
    }
}
