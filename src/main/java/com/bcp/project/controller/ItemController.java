package com.bcp.project.controller;

import com.bcp.project.entity.Item;
import com.bcp.project.repository.ItemRepository;
import com.bcp.project.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:9090" })
@RestController
@RequestMapping("/api")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/getItems")
    public List<Item> findAllOrders(){
        return itemRepository.findAll();
    }

    @GetMapping("/titles")
    public List<ItemServiceImpl> getJoinInformation(){
        return itemRepository.getJoinInformation();
    }

    @GetMapping("/titles/{rating}")
    public List<Item> getJoinInformation(@PathVariable Double rating){
        return itemRepository.findItemsWithAverageRatingLowerThan(rating);
    }
}
