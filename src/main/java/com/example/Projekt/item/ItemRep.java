package com.example.Projekt.item;

import com.example.Projekt.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRep extends JpaRepository<Item,Long> {

}
