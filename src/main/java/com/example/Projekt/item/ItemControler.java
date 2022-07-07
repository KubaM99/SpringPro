package com.example.Projekt.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ItemControler {
    @Autowired
    private ItemService itemService;

    @PostMapping("/i")
    public void  addd(@RequestBody Item item){
        itemService.save(item);
    }

    @RequestMapping("/i")
    public List<Item> getAll(){
       return itemService.getAll();
    }

}
