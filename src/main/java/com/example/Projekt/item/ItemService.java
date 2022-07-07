package com.example.Projekt.item;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ItemService {

    private ItemRep itemRep;

    public List<Item> getAll(){
        List<Item> items = new ArrayList<>();
        itemRep.findAll().forEach(items :: add);
        return items;
    }

    public void save(Item item){
        itemRep.save(item);
    }

}
